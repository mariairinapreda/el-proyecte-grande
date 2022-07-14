package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productRelated.FrontPanel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/front-panel")
public class FrontPanelController {

    @GetMapping
    public List<FrontPanel> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public FrontPanel getById(@PathVariable("id") Long id){
        return null;
    }

}
