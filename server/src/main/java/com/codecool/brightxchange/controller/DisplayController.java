package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.Display;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/display")
public class DisplayController {

    @GetMapping
    public List<Display> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Display getById(@PathVariable("id") Long id){
        return null;
    }


}
