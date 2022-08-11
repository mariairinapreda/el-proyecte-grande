package com.codecool.brightxchange.controller.coolerController;


import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.products.Cooler;
import com.codecool.brightxchange.service.products.CoolerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/cooler")
public class CoolerController {

    private CoolerService coolerService;

    public CoolerController(CoolerService coolerService) {
        this.coolerService = coolerService;
    }

    @GetMapping
    public List<Cooler> getAll(){
        return coolerService.getAll();
    }

    @GetMapping("{id}")
    public Cooler getById(@PathVariable("id") Long id){
        return coolerService.getById(id).orElse(null);
    }

    @PostMapping
    public void addCooler(@RequestBody Cooler tempCooler){
        coolerService.addCooler(tempCooler);
    }


    @PutMapping("{id}")
    public void updateCooler(@PathVariable("id") long id, @RequestBody Cooler updatedCooler){coolerService.updateCooler(id,updatedCooler);}


    @PutMapping("{id}")
    public void updateCoolerSupplier(@PathVariable Long id, @RequestBody Supplier supplier){
        coolerService.updateSupplier(id, supplier);
    }

}
