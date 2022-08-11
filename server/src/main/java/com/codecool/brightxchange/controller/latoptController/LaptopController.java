package com.codecool.brightxchange.controller.latoptController;


import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.*;
import com.codecool.brightxchange.service.products.LaptopService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/laptop")
public class LaptopController {

    private LaptopService laptopService;

    public LaptopController(LaptopService laptopService) {
        this.laptopService = laptopService;
    }

    @GetMapping
    public List<Laptop> getAll(){
        return laptopService.getAll();
    }

    @GetMapping("{id}")
    public Laptop getById(@PathVariable("id") Long id){
        return laptopService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewLaptop(@RequestBody Laptop laptop){
        laptopService.addLaptop(laptop);
    }

    @PutMapping("{id}")
    public void updateLaptop(@PathVariable("id") Long id, @RequestBody Laptop laptop){
        laptopService.update(laptop.getId(), laptop.getPrice(), laptop.getWeight(), laptop.getQuantity());
    }

    @PutMapping("{id}")
    public void updateVideoBackPanel(@PathVariable("id")Long id, @RequestBody VideoBackPanel videoBackPanel){
        laptopService.updateVideoBackPanel(id, videoBackPanel);
    }

    @PutMapping("{id}")
    public void updateConnectivity(@PathVariable("id")Long id, @RequestBody Connectivity connectivity){
        laptopService.updateConnectivity(id, connectivity);
    }

    @PutMapping("{id}")
    public void updateDisplay(@PathVariable("id")Long id, @RequestBody Display display){
        laptopService.updateDisplay(id, display);
    }

    @PutMapping("{id}")
    public void updateGraphicsCard(@PathVariable("id") Long id, @RequestBody GraphicsCard graphicsCard){
        laptopService.updateGraphicsCard(id, graphicsCard);
    }

    @PutMapping("{id}")
    public void updateLaptopProducer(@PathVariable("id") Long id, @RequestBody LaptopProducer laptopProducer){
        laptopService.updateLaptopProducer(id, laptopProducer);
    }

    @PutMapping("{id}")
    public void updateMemory(@PathVariable("id")Long id, @RequestBody RandomAccessMemory randomAccessMemory){
        laptopService.updateMemory(id, randomAccessMemory);
    }

    @PutMapping("{id}")
    public void updateProcessor(@PathVariable("id")Long id, @RequestBody Processor processor){
        laptopService.updateProcessor(id, processor);
    }

    @PutMapping("{id}")
    public void updateStorage(@PathVariable("id")Long id, @RequestBody Storage storage){
        laptopService.updateStorage(id, storage);
    }

}
