package com.codecool.brightxchange.controller.desktopController;

import com.codecool.brightxchange.model.products.Desktop;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/desktop")
public class DesktopController {
    @GetMapping
    public List<Desktop> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Desktop getById(@PathVariable("id") Long id){
        return null;
    }



}
