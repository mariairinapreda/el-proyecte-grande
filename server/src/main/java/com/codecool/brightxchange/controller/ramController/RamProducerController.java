package com.codecool.brightxchange.controller.ramController;

import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.service.producers.RAMProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ram-producer")
public class RamProducerController {
    private final RAMProducerService producerService;

    public RamProducerController(RAMProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public List<RAMProducer> getAll(){
        return producerService.getAll();
    }

    @GetMapping("{id}")
    public RAMProducer getById(@PathVariable("id") Long id){
        return producerService.getById(id).get();
    }

    @PostMapping
    public void add(@RequestBody RAMProducer ramProducer){
        producerService.addRAMProducer(ramProducer);
    }
    @PutMapping("{id}")
    public void updateRamProducer(@PathVariable("id")long id, @RequestBody RAMProducer ramProducer){
        producerService.updateRAMProducer(id, ramProducer.getName());
    }

}
