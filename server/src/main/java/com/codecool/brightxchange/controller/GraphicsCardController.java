package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.products.GraphicsCard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphics-card")
public class GraphicsCardController {

    @GetMapping
    public List<GraphicsCard> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GraphicsCard getById(@PathVariable("id") Long id){
        return null;
    }

}
