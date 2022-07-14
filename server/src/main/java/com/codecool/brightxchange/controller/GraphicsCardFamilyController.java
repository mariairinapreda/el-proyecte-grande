package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
