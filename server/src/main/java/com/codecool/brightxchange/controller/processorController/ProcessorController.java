package com.codecool.brightxchange.controller.processorController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ProcessorProducer;
import com.codecool.brightxchange.model.products.Processor;
import com.codecool.brightxchange.service.products.ProcessorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/processor")
public class ProcessorController {
    private final ProcessorService processorService;

    public ProcessorController(ProcessorService processorService) {
        this.processorService = processorService;
    }

    @GetMapping
    public List<Processor> getAll(){
        return processorService.getAll();
    }

    @GetMapping("{id}")
    public Processor getById(@PathVariable("id") Long id){
        return processorService.getById(id).get();
    }

    @PostMapping
    public void add(@RequestBody Processor processor){
        processorService.addProcessor(processor);
    }
    @PutMapping("{id}")
    public void updateProcessor(@PathVariable("id")long id, @RequestBody Processor processor){
        processorService.updateProcessor(id, processor.getPrice(),
                processor.getQuantity(),
                processor.getCore(),
                processor.getNumberOfCores(),
                processor.getFrequencyTurboMax(),
                processor.getNumberOfCores(),
                processor.getProductionFactory(),
                processor.getSocket(),
                processor.getThreads());
    }

    @PutMapping("{id}")
    public void updateSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        processorService.updateSupplier(id, supplier);
    }
    @PutMapping("{id}")
    public void updateProducer(@PathVariable("id")long id, @RequestBody ProcessorProducer producer){
        processorService.updateProducer(id, producer);
    }


}
