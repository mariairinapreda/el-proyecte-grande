package com.codecool.brightxchange.controller.latoptController;

import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.service.producers.LaptopProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/laptop-producer")
public class LaptopProducerController {

    private LaptopProducerService laptopProducerService;

    public LaptopProducerController(LaptopProducerService laptopProducerService) {
        this.laptopProducerService = laptopProducerService;
    }

    @GetMapping
    public List<LaptopProducer> getAll(){
        return laptopProducerService.getAll();
    }

    @GetMapping("{id}")
    public LaptopProducer getById(@PathVariable("id") Long id){
        return laptopProducerService.getById(id).orElse(null);
    }

    @PutMapping("{id}")
    public void updateLaptopProducer(@PathVariable("id")Long id, @RequestBody LaptopProducer laptopProducer){
        laptopProducerService.updateLaptopProducer(id, laptopProducer.getName());
    }

    @PostMapping
    public void saveNewLaptopProducer(@RequestBody LaptopProducer laptopProducer){
        laptopProducerService.addLaptopProducer(laptopProducer);
    }

}
