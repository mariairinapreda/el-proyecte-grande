package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.Monitor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/monitor")
public class MonitorController {


    @GetMapping
    public List<Monitor> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Monitor getById(@PathVariable("id") Long id){
        return null;
    }
}
