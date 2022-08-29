package com.codecool.brightxchange.controller.storageController;

import com.codecool.brightxchange.controller.ssdController.SSDController;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.StorageProducer;
import com.codecool.brightxchange.model.products.HDD;
import com.codecool.brightxchange.model.products.SSD;
import com.codecool.brightxchange.model.products.Storage;
import com.codecool.brightxchange.service.products.StorageService;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Table;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/storage")
public class StorageController {
    private final StorageService storageService;

    public StorageController(StorageService storageService) {
        this.storageService = storageService;
    }


    @GetMapping
    public List<Storage> getAll(){
        return storageService.getAll();
    }

    @GetMapping("{id}")
    public Storage getById(@PathVariable("id") Long id){
        return storageService.getById(id).get();
    }

    @PostMapping
    public void addStorage(@RequestBody Storage storage){
        storageService.addStorage(storage);
    }

    @PutMapping("{id}")
    public void updateStorage(@PathVariable("id")long id, @RequestBody Storage storage){
        storageService.updateStorage(id, storage.getCapacity(),
                storage.getQuantity(),
                storage.getPrice());
    }

    @PutMapping("{id}/supplier")
    public void updateSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        storageService.updateSupplier(id, supplier);
    }
    @PutMapping("{id}/storage-producer")
    public void updateStorageProducer(@PathVariable("id")long id, @RequestBody StorageProducer storageProducer){
        storageService.updateStorageProducer(id, storageProducer);
    }
    @PutMapping("{id}/ssd")
    public void updateSSD(@PathVariable("id")long id, @RequestBody SSD ssd){
        storageService.updateSSD(id, ssd);
    }
    @PutMapping("{id}/hdd")
    public void updateHDD(@PathVariable("id")long id, @RequestBody HDD hdd){
        storageService.updateHDD(id, hdd);
    }

}
