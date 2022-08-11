package com.codecool.brightxchange.controller.ssdController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.products.SSD;
import com.codecool.brightxchange.service.products.SsdService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/ssd")
public class SSDController {
    private final SsdService service;

    public SSDController(SsdService service) {
        this.service = service;
    }

    @GetMapping
    public List<SSD> getAll(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public SSD getById(@PathVariable("id") Long id){
        return service.getById(id).get();
    }


    @PostMapping
    public void addSSD(@RequestBody SSD ssd){
        service.addSSD(ssd);
    }
    @PutMapping("{id}")
    public void updateSSD(@PathVariable("id")long id, @RequestBody SSD ssd){
        service.updateSSD(id, ssd.getQuantity(),
                ssd.getReadSpeed(),
                ssd.getWriteSpeed(),
                ssd.getPrice());
    }

    @PutMapping("{id}/supplier")
    public void updateSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        service.updateSupplier(id, supplier);
    }


}
