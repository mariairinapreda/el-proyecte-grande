package com.codecool.brightxchange.controller.ventController;

import com.codecool.brightxchange.model.products.Vent;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/vent")
public class VentController {

    @GetMapping
    public List<Vent> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Vent getById(@PathVariable("id") Long id){
        return null;
    }
}
