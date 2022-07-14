package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.LaptopProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/laptop-producer")
public class LaptopProducerController {

    @GetMapping
    public List<LaptopProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public LaptopProducer getById(@PathVariable("id") Long id){
        return null;
    }
}
