package com.codecool.brightxchange.controller;


import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
