package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.Supplier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    @GetMapping
    public List<Supplier> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Supplier getById(@PathVariable("id") Long id){
        return null;
    }
}
