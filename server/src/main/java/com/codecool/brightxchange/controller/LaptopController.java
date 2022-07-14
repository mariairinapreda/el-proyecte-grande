package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.products.Laptop;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
