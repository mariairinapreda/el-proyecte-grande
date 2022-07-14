package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.GCConnectionInterface;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
