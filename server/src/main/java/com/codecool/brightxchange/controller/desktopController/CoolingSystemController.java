package com.codecool.brightxchange.controller.desktopController;

import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.service.productRelated.CoolingSystemService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cooling-system")
public class CoolingSystemController {

    private CoolingSystemService coolingSystemService;

    public CoolingSystemController(CoolingSystemService coolingSystemService) {
        this.coolingSystemService = coolingSystemService;
    }

    @GetMapping
    public List<CoolingSystem> getAll(){
        return coolingSystemService.getAll();
    }

    @GetMapping("{id}")
    public CoolingSystem getById(@PathVariable("id") Long id){
        return coolingSystemService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewCoolingSystem(@RequestBody CoolingSystem coolingSystem){
        coolingSystemService.addCoolingSystem(coolingSystem);
    }

    @PutMapping("{id}")
    public void updateCoolingSystem(@PathVariable("id") long id, @RequestBody CoolingSystem updatedCoolingSystem){
        coolingSystemService.updateCoolingSystem(id, updatedCoolingSystem);
    }

}
