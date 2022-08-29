package com.codecool.brightxchange.controller.desktopController;


import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.service.productRelated.FrontPanelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/front-panel")
public class FrontPanelController {

    private FrontPanelService frontPanelService;

    public FrontPanelController(FrontPanelService frontPanelService) {
        this.frontPanelService = frontPanelService;
    }

    @GetMapping
    public List<FrontPanel> getAll(){
        return frontPanelService.getAll();
    }

    @GetMapping("{id}")
    public FrontPanel getById(@PathVariable("id") Long id){
        return frontPanelService.GetById(id).orElse(null);
    }

    @PostMapping()
    public void saveNewFrontPanel(@RequestBody FrontPanel frontPanel){
        frontPanelService.saveFrontPanel(frontPanel);
    }

    @PutMapping("{id}")
    public void updateFrontPanel(@PathVariable("id") long id, @RequestBody FrontPanel frontPanel){
        frontPanelService.updateFrontPanel(id, frontPanel);
    }
}
