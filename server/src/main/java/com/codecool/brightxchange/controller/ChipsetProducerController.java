package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
