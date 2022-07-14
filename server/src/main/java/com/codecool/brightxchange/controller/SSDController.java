package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.SSD;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ssd")
public class SSDController {

    @GetMapping
    public List<SSD> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public SSD getById(@PathVariable("id") Long id){
        return null;
    }
}
