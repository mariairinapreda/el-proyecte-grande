package com.codecool.brightxchange.controller.powerSupplyController;


import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.codecool.brightxchange.model.products.PowerSupply;
import com.codecool.brightxchange.service.products.PowerSupplyService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/power-supply")
public class PowerSupplyController {
    private final PowerSupplyService powerSupplyService;


    public PowerSupplyController(PowerSupplyService powerSupplyService) {
        this.powerSupplyService = powerSupplyService;
    }

    @GetMapping
    public List<PowerSupply> getAll(){
        return powerSupplyService.getAll();
    }

    @GetMapping("{id}")
    public PowerSupply getById(@PathVariable("id") Long id){
        return powerSupplyService.getById(id).get();
    }

    @PostMapping
    public void addPowerSupply(@RequestBody PowerSupply powerSupply){
        powerSupplyService.addPowerSupply(powerSupply);
    }

    @PutMapping("{id}")
    public void updatePowerSupply(@PathVariable("id")long id, @RequestBody PowerSupply powerSupply){
        powerSupplyService.updatePowerSupply(id, powerSupply.getPower(),
                powerSupply.getQuantity(),
                powerSupply.getCertification(),
                powerSupply.getQuantity());
    }

    @PutMapping("{id}/power-supply-supplier")
    public void updateSupplier(@PathVariable("id")long id,@RequestBody Supplier supplier){
        powerSupplyService.updateSupplier(id, supplier);
    }
    @PutMapping("{id}/power-supply-type")
    public void updateType(@PathVariable("id")long id, @RequestBody PowerSupplyType powerSupplyType){
        powerSupplyService.updatePowerSupplyType(id, powerSupplyType);
    }

    @PutMapping("{id}/power-supply-producer")
    public void updatePowerSupplyProducer(@PathVariable("id")long id, @RequestBody PowerSupplyProducer powerSupplyProducer){
        powerSupplyService.updatePowerSupplyProducer(id, powerSupplyProducer);
    }

}
