package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.service.SupplierService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/supplier")
public class SupplierController {

    private final SupplierService supplierService;

    public SupplierController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Supplier> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Supplier getById(@PathVariable("id") Long id){
        return null;
    }
}
