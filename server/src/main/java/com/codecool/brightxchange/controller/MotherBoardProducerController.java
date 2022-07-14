package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.MotherboardProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mother-board-producer")
public class MotherBoardProducerController {

    @GetMapping
    public List<MotherboardProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public MotherboardProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
