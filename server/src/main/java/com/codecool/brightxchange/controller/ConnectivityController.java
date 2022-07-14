package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productRelated.Connectivity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
