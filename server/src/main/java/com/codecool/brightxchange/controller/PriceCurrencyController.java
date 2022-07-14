package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.PriceCurrency;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
