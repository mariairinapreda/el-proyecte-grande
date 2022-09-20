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
    private ProductService productService;
    private OrderService orderService;
    private CartItemService cartItemService;
    public static final String SUCCESS_URL = "/plata/efectuata";
    public static final String CANCEL_URL = "/plata/nereusita";

    public PaypalController(PaypalService paypalService) {
        this.paypalService = paypalService;
    }


    @PostMapping("/pay")
    public ResponseEntity<String> payment(@RequestBody Order order) throws PayPalRESTException {
        try {
            Payment payment = paypalService.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(),
                    SUCCESS_URL, CANCEL_URL);
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
