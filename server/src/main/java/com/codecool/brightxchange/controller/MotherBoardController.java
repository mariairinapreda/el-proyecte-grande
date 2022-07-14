package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.products.Motherboard;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mother-board")
public class MotherBoardController {

    @GetMapping
    public List<Motherboard> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Motherboard getById(@PathVariable("id") Long id){
        return null;
    }
}
