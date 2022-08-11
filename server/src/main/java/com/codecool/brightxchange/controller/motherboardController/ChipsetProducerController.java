package com.codecool.brightxchange.controller.motherboardController;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.service.producers.ChipsetProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/chipset-producer")
public class ChipsetProducerController {
    private final ChipsetProducerService chipsetProducerService;


    public ChipsetProducerController(ChipsetProducerService chipsetProducerService) {
        this.chipsetProducerService = chipsetProducerService;
    }

    @GetMapping
    public List<ChipsetProducer> getAll(){
        return chipsetProducerService.getAll();
    }

    @GetMapping("{id}")
    public ChipsetProducer getById(@PathVariable("id") Long id){
        return chipsetProducerService.getById(id).get();
    }


    @PostMapping
    public void addChipsetProducer(@RequestBody ChipsetProducer chipsetProducer){
        chipsetProducerService.addChipsetProducer(chipsetProducer);
    }

    @PutMapping("{id}")
    public void updateChipsetProducer(@PathVariable("id")long id, @RequestBody ChipsetProducer chipsetProducer){
        chipsetProducerService.updateChipsetProducer(id, chipsetProducer.getName());
    }
}
