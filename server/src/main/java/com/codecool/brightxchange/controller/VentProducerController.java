package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.VentProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/vent-producer")
public class VentProducerController {

    @GetMapping
    public List<VentProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public VentProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
