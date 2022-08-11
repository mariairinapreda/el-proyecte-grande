package com.codecool.brightxchange.controller.powerSupplyController;


import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.codecool.brightxchange.service.types.PowerSupplyTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/power-supply-type")
public class PowerSupplyTypeController {
    private final PowerSupplyTypeService powerSupplyTypeService;


    public PowerSupplyTypeController(PowerSupplyTypeService powerSupplyTypeService) {
        this.powerSupplyTypeService = powerSupplyTypeService;
    }

    @GetMapping
    public List<PowerSupplyType> getAll(){
        return powerSupplyTypeService.getAll();
    }

    @GetMapping("{id}")
    public PowerSupplyType getById(@PathVariable("id") Long id){
        return powerSupplyTypeService.getById(id).get();
    }

    @PostMapping
    public void addPowerSupplyType(@RequestBody PowerSupplyType powerSupplyType){
        powerSupplyTypeService.addPowerSupplyType(powerSupplyType);
    }
    @PutMapping("{id}")
    public void updatePowerSupplyType(@PathVariable("id")long id, @RequestBody PowerSupplyType powerSupplyType){
        powerSupplyTypeService.updatePowerSupplyType(id, powerSupplyType);
    }



}
