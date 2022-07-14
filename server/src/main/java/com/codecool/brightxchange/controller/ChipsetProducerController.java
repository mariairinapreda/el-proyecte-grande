package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/chipset-producer")
public class ChipsetProducerController {

    @GetMapping
    public List<ChipsetProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public ChipsetProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
