package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productRelated.GCModel;
import com.codecool.brightxchange.service.productRelated.GCModelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/graphics-card-model")
public class GCModelController {

    private GCModelService gcModelService;

    public GCModelController(GCModelService gcModelService) {
        this.gcModelService = gcModelService;
    }

    @GetMapping
    public List<GCModel> getAll(){
        return gcModelService.getAll();
    }

    @GetMapping("{id}")
    public GCModel getById(@PathVariable("id") Long id){
        return gcModelService.getGCModelById(id).orElse(null);
    }


    @PostMapping
    public void saveNewGCModel(@RequestBody GCModel gcModel){
        gcModelService.addGraphicCardModel(gcModel);
    }

    @PostMapping("{id}")
    public void updateGCModel(@PathVariable("id") long id, @RequestBody GCModel gcModel){
        gcModelService.updateGCModel(id, gcModel);
    }

}
