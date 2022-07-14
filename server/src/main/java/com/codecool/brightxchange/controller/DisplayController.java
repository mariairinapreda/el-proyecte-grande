package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.Display;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/display")
public class DisplayController {

    @GetMapping
    public List<Display> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Display getById(@PathVariable("id") Long id){
        return null;
    }


}
