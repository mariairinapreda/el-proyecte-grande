package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.RAMProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/ram-producer")
public class RamProducerController {

    @GetMapping
    public List<RAMProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public RAMProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
