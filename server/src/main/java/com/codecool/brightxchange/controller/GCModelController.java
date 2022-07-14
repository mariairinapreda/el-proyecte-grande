package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GCModel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
