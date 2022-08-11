package com.codecool.brightxchange.controller.motherboardController;


import com.codecool.brightxchange.model.products.Motherboard;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mother-board")
public class MotherBoardController {

    @GetMapping
    public List<Motherboard> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Motherboard getById(@PathVariable("id") Long id){
        return null;
    }
}
