package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.ProcessorProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/processor-producer")
public class ProcessorProducerController {


    @GetMapping
    public List<ProcessorProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public ProcessorProducer getById(@PathVariable("id") Long id){
        return null;
    }
}
