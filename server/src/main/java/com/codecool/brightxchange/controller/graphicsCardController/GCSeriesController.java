package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productRelated.GCSeries;
import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import com.codecool.brightxchange.service.productRelated.GCSeriesService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-series")
public class GCSeriesController {

    private GCSeriesService gcSeriesService;

    public GCSeriesController(GCSeriesService gcSeriesService) {
        this.gcSeriesService = gcSeriesService;
    }

    @GetMapping
    public List<GCSeries> getAll(){
        return gcSeriesService.getAll();
    }

    @GetMapping("{id}")
    public GCSeries getById(@PathVariable("id") Long id){
        return gcSeriesService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewGCSeries(@RequestBody GCSeries gcSeries){
        gcSeriesService.addGCSeriesService(gcSeries);
    }

    @PutMapping("{id}")
    public void updateGCSeries(@PathVariable("id") Long id, @RequestBody GCSeries gcSeries){
        gcSeriesService.updateGCSeries(id, gcSeries);
    }

    @PutMapping("{id}/graphics-card-family")
    public void updateCardFamily(@PathVariable("id") Long id, @RequestBody GraphicsCardFamily graphicsCardFamily){
        gcSeriesService.updateCardFamily(id, graphicsCardFamily);
    }

}
