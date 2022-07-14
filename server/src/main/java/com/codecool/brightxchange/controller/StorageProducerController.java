package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.producers.StorageProducer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/storage-producer")
public class StorageProducerController {
    @GetMapping
    public List<StorageProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public StorageProducer getById(@PathVariable("id") Long id){
        return null;
    }


}
