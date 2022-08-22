package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.Producer;
import com.codecool.brightxchange.service.ProducerService;
import com.codecool.brightxchange.service.ProductService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("producers")
public class ProducerController {

    private ProducerService producerService;

    public ProducerController(ProducerService producerService) {
        this.producerService = producerService;
    }

    public void addProducer(Producer producer){
        producerService.addProducerService(producer);
    }
}
