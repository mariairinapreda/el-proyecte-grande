package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productRelated.Connectivity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/connectivity")
public class ConnectivityController {

    @GetMapping
    public List<Connectivity> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Connectivity getById(@PathVariable("id") Long id){
        return null;
    }

}
