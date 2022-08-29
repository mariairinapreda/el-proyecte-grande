package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.service.PriceCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/price-currency")
public class PriceCurrencyController {
    private final PriceCurrencyService priceCurrencyService;

    public PriceCurrencyController(PriceCurrencyService priceCurrencyService) {
        this.priceCurrencyService = priceCurrencyService;
    }

    @GetMapping
    public List<PriceCurrency> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public PriceCurrency getById(@PathVariable("id") Long id){
        return null;
    }


}
