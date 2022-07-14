package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphics-card-family")
public class GraphicsCardFamilyController {
    @GetMapping
    public List<GraphicsCardFamily> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GraphicsCardFamily getById(@PathVariable("id") Long id){
        return null;
    }


}
