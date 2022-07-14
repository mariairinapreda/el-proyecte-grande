package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.PriceCurrency;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/price-currency")
public class PriceCurrencyController {

    @GetMapping
    public List<PriceCurrency> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public PriceCurrency getById(@PathVariable("id") Long id){
        return null;
    }
}
