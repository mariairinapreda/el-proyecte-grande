package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.RandomAccessMemory;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/random-access-memory")
public class RandomAccessMemoryController {

    @GetMapping
    public List<RandomAccessMemory> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public RandomAccessMemory getById(@PathVariable("id") Long id){
        return null;
    }
}
