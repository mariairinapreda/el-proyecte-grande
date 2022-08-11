package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productRelated.GCSeries;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-series")
public class GCSeriesController {
    @GetMapping
    public List<GCSeries> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public GCSeries getById(@PathVariable("id") Long id){
        return null;
    }

}
