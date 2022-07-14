package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.products.PowerSupply;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/power-supply")
public class PowerSupplyController {

    @GetMapping
    public List<PowerSupply> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public PowerSupply getById(@PathVariable("id") Long id){
        return null;
    }


}
