package com.codecool.brightxchange.controller.ventController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.VentProducer;
import com.codecool.brightxchange.model.products.Vent;
import com.codecool.brightxchange.repositories.products.VentDAO;
import com.codecool.brightxchange.service.products.VentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/vent")
public class VentController {
    private final VentService ventService;


    public VentController(VentService ventService) {
        this.ventService = ventService;
    }

    @GetMapping
    public List<Vent> getAll(){
        return ventService.getAll();
    }

    @GetMapping("{id}")
    public Vent getById(@PathVariable("id") Long id){
        return ventService.getById(id).get();
    }

    @PostMapping
    public void addVent(@RequestBody Vent vent){
        ventService.addVent(vent);
    }
    @PutMapping("{id}")
    public void updateVent(@PathVariable("ïd") long id, @RequestBody Vent vent){
        ventService.updateVent(id, vent);
    }
    @PutMapping("{id}/supplier")
    public void updateVentSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        ventService.updateVentSupplier(id, supplier);
    }
    @PutMapping("{id}/vent-producer")
    public void updateVentProducer(@PathVariable("id")long id, @RequestBody VentProducer ventProducer){
        ventService.updateVentProducer(id, ventProducer);
    }
}
