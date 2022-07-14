package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.Storage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/storage")
public class StorageController {

    @GetMapping
    public List<Storage> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Storage getById(@PathVariable("id") Long id){
        return null;
    }

}
