package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/monitor-producer")
public class MonitorProducerController {

    @GetMapping
    public List<MonitorProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public MonitorProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
