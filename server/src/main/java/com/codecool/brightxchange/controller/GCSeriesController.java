package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GCSeries;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/graphics-card-series")
public class GCSeriesController {
    @GetMapping
    public List<GCSeries> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GCSeries getById(@PathVariable("id") Long id){
        return null;
    }

}
