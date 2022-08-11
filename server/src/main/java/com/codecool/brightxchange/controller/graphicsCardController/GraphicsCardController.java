package com.codecool.brightxchange.controller.graphicsCardController;


import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.model.productRelated.*;
import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import com.codecool.brightxchange.model.products.GraphicsCard;
import com.codecool.brightxchange.service.products.GraphicsCardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card")
public class GraphicsCardController {

    private GraphicsCardService graphicsCardService;

    public GraphicsCardController(GraphicsCardService graphicsCardService) {
        this.graphicsCardService = graphicsCardService;
    }

    @GetMapping
    public List<GraphicsCard> getAll(){
        return graphicsCardService.getAll();
    }

    @GetMapping("{id}")
    public GraphicsCard getById(@PathVariable("id") Long id){
        return graphicsCardService.getGraphicsCardById(id).orElse(null);
    }

    @PostMapping
    public void saveNewGraphicsCard(@RequestBody GraphicsCard graphicsCard){
        graphicsCardService.saveGraphicsCard(graphicsCard);
    }

    @PutMapping("{id}")
    public void updateGraphicsCard(@PathVariable("id") Long id,@RequestBody GraphicsCard graphicsCard){
        graphicsCardService.updateGraphicsCard(id, graphicsCard);
    }

    @PutMapping("{id}")
    public void updateGraphicsCardModel(@PathVariable("id") Long id, @RequestBody GCModel gcModel){
        graphicsCardService.updateGraphicsCardModel(id, gcModel);
    }

    @PutMapping("{id}")
    public void updateGraphicsMemoryType(@PathVariable("id")Long id, @RequestBody GraphicsCardMemoryType graphicsCardMemoryType){
        graphicsCardService.updateGraphicsMemoryType(id, graphicsCardMemoryType);
    }

    @PutMapping("{id}")
    public void updateCardFamily(@PathVariable("id") Long id, @RequestBody GraphicsCardFamily graphicsCardFamily){
        graphicsCardService.updateCardFamily(id, graphicsCardFamily);
    }

    @PutMapping("{id}")
    public void updateGcSeries(@PathVariable("id") Long id, @RequestBody GCSeries gcSeries){
        graphicsCardService.updateGcSeries(id, gcSeries);
    }

    @PutMapping("{id}")
    public void updateGraphicsCardProducer(@PathVariable("id") Long id, @RequestBody GraphicsCardProducer graphicsCardProducer){
        graphicsCardService.updateGraphicsCardProducer(id, graphicsCardProducer);
    }

    @PutMapping("{id}")
    public void updateGraphicsCardSupplier(@PathVariable("id") Long id, @RequestBody Supplier supplier){
        graphicsCardService.updateGraphicsCardSupplier(id, supplier);
    }

    @PutMapping("{id}")
    public void updateGCConnectionInterFace(@PathVariable("id") Long id, @RequestBody GCConnectionInterface gcConnectionInterface){
        graphicsCardService.updateGCConnectionInterFace(id, gcConnectionInterface);
    }

    @PutMapping("{id}")
    public void updateGcVideoBackPanel(@PathVariable("id") Long id, @RequestBody VideoBackPanel videoBackPanel){
        graphicsCardService.updateGcVideoBackPanel(id, videoBackPanel);
    }



}
