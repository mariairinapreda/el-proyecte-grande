package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mother-board-back-panel")
public class MotherBoardBackPanelController {

    @GetMapping
    public List<MotherBoardBackPanel> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public MotherBoardBackPanel getById(@PathVariable("id") Long id){
        return null;
    }
}
