package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.Order;
import com.codecool.brightxchange.service.PaypalService;
import com.paypal.api.payments.Links;
import com.paypal.api.payments.Payment;
import com.paypal.base.rest.PayPalRESTException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PaypalController {
    @Autowired
    PaypalService paypalService;
    public static final String SUCCES_URL="pay/success";
    public static final String CANCEL_URL="pay/cancel";
@GetMapping("/")
    public String home(){
        return "home";
    }
    @PostMapping("/pay")
public String payment(@ModelAttribute("order") Order order) throws PayPalRESTException {
    try {
        Payment payment = paypalService.createPayment(order.getPrice(), order.getCurrency(), order.getMethod(), "http://localhost:8888" + SUCCES_URL, "http://localhost:8888" + CANCEL_URL);
        for(Links link:payment.getLinks()){
            if(link.getRel().equals("approval_url")){
                return "redirect:"+link.getHref();
            }
        }

    }catch(PayPalRESTException e){
        e.printStackTrace();
    }
    return "redirect:/";
}
@GetMapping(value = CANCEL_URL)
    public String cancelPay(){
    return "cancel";
}

@GetMapping(value = SUCCES_URL)
    public String successPay(@RequestParam("paymentId")String paymentId, @RequestParam("payerId")String payerId){
    try{
        Payment payment=paypalService.executePayment(paymentId,payerId);
        System.out.println(payment.toJSON());
        if(payment.getState().equals("approved")){
            return "success";
        }
    }catch (PayPalRESTException e){
        System.out.println(e.getMessage());    }
    return "redirect:/";
}

}
