package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.VentProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
