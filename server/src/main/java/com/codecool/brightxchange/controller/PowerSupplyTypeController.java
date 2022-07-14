package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
