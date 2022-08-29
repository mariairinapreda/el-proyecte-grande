package com.codecool.brightxchange.controller.hddController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.model.products.HDD;
import com.codecool.brightxchange.service.products.HddService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/hdd")
public class HDDController {

    private HddService hddService;

    public HDDController(HddService hddService) {
        this.hddService = hddService;
    }

    @GetMapping
    public List<HDD> getAll(){
        return hddService.getAll();
    }

    @GetMapping("{id}")
    public HDD getById(@PathVariable("id") Long id){
        return hddService.getHDDBYid(id).orElse(null);
    }

    @PutMapping("{id}")
    public void updateHdd(@PathVariable("id") Long id, @RequestBody HDD hdd ){
        hddService.updateHdd(id, hdd);
    }

    @PostMapping
    public void saveNewHDD(@RequestBody HDD hdd){
        hddService.saveHDD(hdd);
    }

    @PutMapping("{id}/supplier")
    public void updateSupplier(@PathVariable("id")Long id, @RequestBody Supplier supplier){
        hddService.updateSupplier(id, supplier);
    }


}
