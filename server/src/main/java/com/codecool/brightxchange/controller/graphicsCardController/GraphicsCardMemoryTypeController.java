package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-memory-type")
public class GraphicsCardMemoryTypeController {

    @GetMapping
    public List<GraphicsCardMemoryType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GraphicsCardMemoryType getById(@PathVariable("id") Long id){
        return null;
    }

}
