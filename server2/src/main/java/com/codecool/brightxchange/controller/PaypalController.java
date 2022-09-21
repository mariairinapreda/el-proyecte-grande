package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.CartItem;
import com.codecool.brightxchange.model.Order;
import com.codecool.brightxchange.model.Product;
import com.codecool.brightxchange.service.CartItemService;
import com.codecool.brightxchange.service.OrderService;
import com.codecool.brightxchange.service.PaypalService;
import com.codecool.brightxchange.service.ProductService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PaypalController {
    private final PaypalService paypalService;
    private final ProductService productService;
    private final OrderService orderService;
    private final CartItemService cartItemService;
    public static final String SUCCESS_URL = "http://localhost:3000/plata/efectuata";
    public static final String CANCEL_URL = "http://localhost:3000/plata/NEefectuata";

    public PaypalController(PaypalService paypalService, ProductService productService, OrderService orderService, CartItemService cartItemService) {
        this.paypalService = paypalService;
        this.productService = productService;
        this.orderService = orderService;
        this.cartItemService = cartItemService;
    }


    @PostMapping("/pay/{clientId}")
    public ResponseEntity<String> payment(@PathVariable Long clientId) throws PayPalRESTException {
        try {
            Order order = orderService.getUnfinishedOrderByClientId(clientId);
            Payment payment = paypalService.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
                    CANCEL_URL,SUCCESS_URL);
            System.out.println(payment);
            for (Links link : payment.getLinks()) {
                if (link.getRel().equals("approval_url")) {
                    return new ResponseEntity<>(link.getHref(), HttpStatus.OK);
                }
            }

        } catch (PayPalRESTException e) {
            e.printStackTrace();
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @GetMapping(value = SUCCESS_URL+"/{paymentId}/{payerId}/{orderId}")
    public String successPay(@PathVariable String paymentId, @PathVariable String payerId, @PathVariable Long orderId) {
        try {
            Payment payment = paypalService.executePayment(paymentId, payerId);
            System.out.println(payment.toJSON());
            if (payment.getState().equals("approved")) {
                Order order = orderService.getById(orderId).get();
                List<CartItem> items= order.getProducts();
                List<Product> products=new ArrayList<>();
                for (CartItem item : items) {
                    item.getProduct().setQuantity(item.getProduct().getQuantity()-item.getQuantity());
                    item.setOrdered(Boolean.TRUE);
                    products.add(item.getProduct());
                }
                productService.saveAll(products);
                cartItemService.saveAll(items);
                order.setFinished(Boolean.TRUE);
                orderService.saveOrder(order);
                return "success";
            }
            else{

                return "redirect:/";
            }
        } catch (PayPalRESTException e) {
            System.out.println(e.getMessage());
        }
        return "redirect:/";
    }

}
