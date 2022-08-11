package com.codecool.brightxchange.controller.desktopController;


import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.codecool.brightxchange.service.productRelated.MotherBoardBackPanelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mother-board-back-panel")
public class MotherBoardBackPanelController {
    private MotherBoardBackPanelService motherBoardBackPanelService;

    public MotherBoardBackPanelController(MotherBoardBackPanelService motherBoardBackPanelService) {
        this.motherBoardBackPanelService = motherBoardBackPanelService;
    }

    @GetMapping
    public List<MotherBoardBackPanel> getAll(){
        return motherBoardBackPanelService.getAll();
    }

    @GetMapping("{id}")
    public MotherBoardBackPanel getById(@PathVariable("id") Long id){
        return motherBoardBackPanelService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewMotherboardBackPanel(@RequestBody MotherBoardBackPanel motherBoardBackPanel){
        motherBoardBackPanelService.saveMotherBoardBackPanel(motherBoardBackPanel);
    }

    @PutMapping("{id}")
    public void updateMotherBoardBackPanel(@PathVariable("id") Long id, @RequestBody MotherBoardBackPanel motherBoardBackPanel){
        motherBoardBackPanelService.updateMotherBoardBackPanel(id, motherBoardBackPanel);
    }
}
