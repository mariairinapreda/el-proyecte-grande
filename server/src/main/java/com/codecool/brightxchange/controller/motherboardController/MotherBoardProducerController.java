package com.codecool.brightxchange.controller.motherboardController;

import com.codecool.brightxchange.model.producers.MotherboardProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mother-board-producer")
public class MotherBoardProducerController {

    @GetMapping
    public List<MotherboardProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public MotherboardProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
