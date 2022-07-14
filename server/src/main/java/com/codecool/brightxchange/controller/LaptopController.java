package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.products.Laptop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laptop")
public class LaptopController {
    @GetMapping
    public List<Laptop> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Laptop getById(@PathVariable("id") Long id){
        return null;
    }

}
