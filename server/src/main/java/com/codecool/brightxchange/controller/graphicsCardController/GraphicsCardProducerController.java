package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.service.producers.GraphicsCardProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-producer")
public class GraphicsCardProducerController {

    private GraphicsCardProducerService graphicsCardProducerService;

    public GraphicsCardProducerController(GraphicsCardProducerService graphicsCardProducerService) {
        this.graphicsCardProducerService = graphicsCardProducerService;
    }

    @GetMapping
    public List<GraphicsCardProducer> getAll(){
        return graphicsCardProducerService.getAll();
    }

    @GetMapping("{id}")
    public GraphicsCardProducer getById(@PathVariable("id") Long id){
        return graphicsCardProducerService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewGraphicsCardProducer(@RequestBody GraphicsCardProducer graphicsCardProducer) {
        graphicsCardProducerService.saveGraphicsCardProducer(graphicsCardProducer);
    }

@PutMapping("{id}")
    public void updateGraphicsCardProducer(@PathVariable("id") Long id, @RequestBody GraphicsCardProducer graphicsCardProducer){
    graphicsCardProducerService.updateGraphicsCardProducer(id, graphicsCardProducer);
    }



}
