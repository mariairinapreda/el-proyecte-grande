package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.Desktop;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/desktop")
public class DesktopController {
    @GetMapping
    public List<Desktop> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Desktop getById(@PathVariable("id") Long id){
        return null;
    }



}
