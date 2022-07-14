package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
