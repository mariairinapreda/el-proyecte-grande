package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.Processor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/processor")
public class ProcessorController {

    @GetMapping
    public List<Processor> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Processor getById(@PathVariable("id") Long id){
        return null;
    }

}
