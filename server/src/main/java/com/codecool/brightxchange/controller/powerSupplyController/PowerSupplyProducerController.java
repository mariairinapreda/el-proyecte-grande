package com.codecool.brightxchange.controller.powerSupplyController;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.service.producers.PowerSupplyProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/power-supply-producer")
public class PowerSupplyProducerController {
    private final PowerSupplyProducerService producerService;


    public PowerSupplyProducerController(PowerSupplyProducerService producerService) {
        this.producerService = producerService;
    }

    @GetMapping
    public List<PowerSupplyProducer> getAll(){
        return producerService.getAll();
    }

    @GetMapping("{id}")
    public PowerSupplyProducer getById(@PathVariable("id") Long id){
        return producerService.getById(id).get();
    }

    @PostMapping
    public void addProducer(@RequestBody PowerSupplyProducer powerSupplyProducer){
        producerService.addPowerSupplyProducer(powerSupplyProducer);
    }

    @PutMapping("{id}")
    public void updatePowerSupplyProducer(@PathVariable("id")long id, @RequestBody PowerSupplyProducer producer){
        producerService.updatePowerSupplyProducer(id, producer.getName());
    }


}
