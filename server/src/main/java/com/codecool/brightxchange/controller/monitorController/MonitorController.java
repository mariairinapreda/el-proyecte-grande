package com.codecool.brightxchange.controller.monitorController;

import com.codecool.brightxchange.model.products.Monitor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/monitor")
public class MonitorController {


    @GetMapping
    public List<Monitor> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Monitor getById(@PathVariable("id") Long id){
        return null;
    }
}
