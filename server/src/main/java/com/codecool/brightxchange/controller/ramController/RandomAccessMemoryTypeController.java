package com.codecool.brightxchange.controller.ramController;

import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/random-access-memory-type")
public class RandomAccessMemoryTypeController {
    @GetMapping
    public List<RandomAccessMemoryType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public RandomAccessMemoryType getById(@PathVariable("id") Long id){
        return null;
    }
}
