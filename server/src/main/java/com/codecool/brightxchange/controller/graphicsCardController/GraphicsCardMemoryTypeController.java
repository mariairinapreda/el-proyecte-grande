package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import com.codecool.brightxchange.service.types.GraphicsCardMemoryTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-memory-type")
public class GraphicsCardMemoryTypeController {

    private GraphicsCardMemoryTypeService graphicsCardMemoryTypeService;

    @GetMapping
    public List<GraphicsCardMemoryType> getAll(){
        return graphicsCardMemoryTypeService.getAll();
    }

    @GetMapping("{id}")
    public GraphicsCardMemoryType getById(@PathVariable("id") Long id){
        return graphicsCardMemoryTypeService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewGraphicsCardMemoryType(@RequestBody GraphicsCardMemoryType graphicsCardMemoryType){
        graphicsCardMemoryTypeService.addGCMemoryType(graphicsCardMemoryType);
    }

    @PutMapping("{id}")
    public void updateGraphicsCardMemoryType(@PathVariable("id")Long id, @RequestBody GraphicsCardMemoryType graphicsCardMemoryType){
        graphicsCardMemoryTypeService.updateGraphicsCardMemoryType(id, graphicsCardMemoryType);
    }

}
