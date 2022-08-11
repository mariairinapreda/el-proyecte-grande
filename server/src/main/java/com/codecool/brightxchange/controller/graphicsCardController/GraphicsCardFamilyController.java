package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import com.codecool.brightxchange.service.productRelated.GraphicsCardFamilyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-family")
public class GraphicsCardFamilyController {

    private GraphicsCardFamilyService graphicsCardFamilyService;

    public GraphicsCardFamilyController(GraphicsCardFamilyService graphicsCardFamilyService) {
        this.graphicsCardFamilyService = graphicsCardFamilyService;
    }

    @GetMapping
    public List<GraphicsCardFamily> getAll(){
        return graphicsCardFamilyService.getAll();
    }

    @GetMapping("{id}")
    public GraphicsCardFamily getById(@PathVariable("id") Long id){
        return graphicsCardFamilyService.getGraphicsCardFamilyById(id).orElse(null);
    }

    @PostMapping
    public void saveNewGraphicsCardFamily(@RequestBody GraphicsCardFamily graphicsCardFamily){
        graphicsCardFamilyService.saveGraphicsCardFamily(graphicsCardFamily);
    }

    @PutMapping("{id}")
    public void updateGraphicsCardFamily(@PathVariable("id") Long id, @RequestBody GraphicsCardFamily graphicsCardFamily){
        graphicsCardFamilyService.updateGraphicCardFamily(id, graphicsCardFamily);
    }




}
