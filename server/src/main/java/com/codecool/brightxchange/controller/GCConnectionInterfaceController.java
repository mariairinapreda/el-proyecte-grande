package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GCConnectionInterface;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gc-connection-interface")
public class GCConnectionInterfaceController {


    @GetMapping
    public List<GCConnectionInterface> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GCConnectionInterface getById(@PathVariable("id") Long id){
        return null;
    }

}
