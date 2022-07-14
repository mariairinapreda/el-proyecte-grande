package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/power-supply-type")
public class PowerSupplyTypeController {

    @GetMapping
    public List<PowerSupplyType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public PowerSupplyType getById(@PathVariable("id") Long id){
        return null;
    }
}
