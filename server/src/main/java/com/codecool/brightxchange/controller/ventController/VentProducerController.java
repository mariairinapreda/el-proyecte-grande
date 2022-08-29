package com.codecool.brightxchange.controller.ventController;

import com.codecool.brightxchange.model.producers.VentProducer;
import com.codecool.brightxchange.service.producers.VentProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/vent-producer")
public class VentProducerController {
    private final VentProducerService ventProducerService;

    public VentProducerController(VentProducerService ventProducerService) {
        this.ventProducerService = ventProducerService;
    }

    @GetMapping
    public List<VentProducer> getAll(){
        return ventProducerService.getAll();
    }

    @GetMapping("{id}")
    public VentProducer getById(@PathVariable("id") Long id){
        return ventProducerService.getById(id).get();
    }

    @PostMapping
    public void addVentProducer(@RequestBody VentProducer ventProducer){
        ventProducerService.addVentProducer(ventProducer);
    }

    @PutMapping("{id}")
    public void updateVentProducer(@PathVariable("id")long id, @RequestBody VentProducer ventProducer){
        ventProducerService.updateVentProducer(id, ventProducer.getName());
    }

}
