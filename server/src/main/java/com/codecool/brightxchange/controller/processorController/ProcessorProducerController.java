package com.codecool.brightxchange.controller.processorController;

import com.codecool.brightxchange.model.producers.ProcessorProducer;
import com.codecool.brightxchange.service.producers.ProcessorProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/processor-producer")
public class ProcessorProducerController {
    private final ProcessorProducerService producerService;

    public ProcessorProducerController(ProcessorProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public List<ProcessorProducer> getAll(){
        return producerService.getAll();
    }

    @GetMapping("{id}")
    public ProcessorProducer getById(@PathVariable("id") Long id){
        return producerService.getById(id).get();
    }

    @PostMapping
    public void addProcessorProducer(@RequestBody ProcessorProducer producer){
        producerService.addProcessorProducer(producer);
    }

    @PutMapping("{id}")
    public void updateProcessorProducer(@PathVariable("id")long id, @RequestBody ProcessorProducer producer){
        producerService.updateProcessorProducer(id, producer.getName());
    }



}
