package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/power-supply-producer")
public class PowerSupplyProducerController {


    @GetMapping
    public List<PowerSupplyProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public PowerSupplyProducer getById(@PathVariable("id") Long id){
        return null;
    }
}
