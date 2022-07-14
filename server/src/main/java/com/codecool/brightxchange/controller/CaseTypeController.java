package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productTypes.CaseType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/case-type")
public class CaseTypeController {

    @GetMapping
    public List<CaseType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public CaseType getById(@PathVariable("id") Long id){
        return null;
    }



}
