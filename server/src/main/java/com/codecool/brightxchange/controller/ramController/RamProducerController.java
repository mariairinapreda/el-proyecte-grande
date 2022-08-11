package com.codecool.brightxchange.controller.ramController;

import com.codecool.brightxchange.model.producers.RAMProducer;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ram-producer")
public class RamProducerController {

    @GetMapping
    public List<RAMProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public RAMProducer getById(@PathVariable("id") Long id){
        return null;
    }

}
