package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GCModel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphics-card-model")
public class GCModelController {

    @GetMapping
    public List<GCModel> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GCModel getById(@PathVariable("id") Long id){
        return null;
    }

}
