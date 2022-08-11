package com.codecool.brightxchange.controller.powerSupplyController;


import com.codecool.brightxchange.model.products.PowerSupply;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/power-supply")
public class PowerSupplyController {

    @GetMapping
    public List<PowerSupply> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public PowerSupply getById(@PathVariable("id") Long id){
        return null;
    }


}
