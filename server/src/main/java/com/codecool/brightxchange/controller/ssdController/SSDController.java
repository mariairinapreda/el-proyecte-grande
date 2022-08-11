package com.codecool.brightxchange.controller.ssdController;

import com.codecool.brightxchange.model.products.SSD;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ssd")
public class SSDController {

    @GetMapping
    public List<SSD> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public SSD getById(@PathVariable("id") Long id){
        return null;
    }
}
