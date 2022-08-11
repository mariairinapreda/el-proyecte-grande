package com.codecool.brightxchange.controller.hddController;

import com.codecool.brightxchange.model.products.HDD;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hdd")
public class HDDController {
    @GetMapping
    public List<HDD> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public HDD getById(@PathVariable("id") Long id){
        return null;
    }


}
