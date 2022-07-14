package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.CaseProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/case-producer")
public class CaseProducerController {

    @GetMapping
    public List<CaseProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public CaseProducer getById(@PathVariable("id") Long id){
        return null;
    }


}
