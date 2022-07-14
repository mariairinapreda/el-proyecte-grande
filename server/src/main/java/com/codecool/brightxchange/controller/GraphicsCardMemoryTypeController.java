package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphics-card-memory-type")
public class GraphicsCardMemoryTypeController {

    @GetMapping
    public List<GraphicsCardMemoryType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GraphicsCardMemoryType getById(@PathVariable("id") Long id){
        return null;
    }

}
