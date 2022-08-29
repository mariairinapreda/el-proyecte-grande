package com.codecool.brightxchange.controller.motherboardController;

import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.codecool.brightxchange.service.producers.MotherBoardProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mother-board-producer")
public class MotherBoardProducerController {
    private final MotherBoardProducerService motherBoardProducerService;

    public MotherBoardProducerController(MotherBoardProducerService motherBoardProducerService) {
        this.motherBoardProducerService = motherBoardProducerService;
    }

    @GetMapping
    public List<MotherboardProducer> getAll(){
        return motherBoardProducerService.getAll();
    }

    @GetMapping("{id}")
    public MotherboardProducer getById(@PathVariable("id") Long id){
        return motherBoardProducerService.getById(id).get();
    }

    @PostMapping
    public void addMotherBoardProducer(@RequestBody MotherboardProducer motherboardProducer){
        motherBoardProducerService.addMotherBoardProducer(motherboardProducer);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id")long id, @RequestBody MotherboardProducer motherboardProducer){
        motherBoardProducerService.updateMotherBoardProducer(id, motherboardProducer);
    }


}
