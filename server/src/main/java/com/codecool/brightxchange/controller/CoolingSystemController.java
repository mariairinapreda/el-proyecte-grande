package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/cooling-system")
public class CoolingSystemController {

    @GetMapping
    public List<CoolingSystem> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public CoolingSystem getById(@PathVariable("id") Long id){
        return null;
    }

}
