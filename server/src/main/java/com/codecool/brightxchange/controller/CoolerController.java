package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.products.Cooler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cooler")
public class CoolerController {

    @GetMapping
    public List<Cooler> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Cooler getById(@PathVariable("id") Long id){
        return null;
    }

}
