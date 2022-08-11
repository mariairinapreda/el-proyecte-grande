package com.codecool.brightxchange.controller.processorController;

import com.codecool.brightxchange.model.producers.ProcessorProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
