package com.codecool.brightxchange.controller.storageController;

import com.codecool.brightxchange.model.producers.StorageProducer;
import com.codecool.brightxchange.service.producers.StorageProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/storage-producer")
public class StorageProducerController {
    private final StorageProducerService storageProducerService;

    public StorageProducerController(StorageProducerService storageProducerService) {
        this.storageProducerService = storageProducerService;
    }

    @GetMapping
    public List<StorageProducer> getAll(){
        return storageProducerService.getAll();
    }

    @GetMapping("{id}")
    public StorageProducer getById(@PathVariable("id") Long id){
        return storageProducerService.getById(id).get();
    }

    @PostMapping
    public void addStorageProducer(@RequestBody StorageProducer storageProducer){
        storageProducerService.addStorageProducer(storageProducer);
    }

    @PutMapping("{id}")
    public void updateStorageProducer(@PathVariable("id")long id, @RequestBody StorageProducer storageProducer){
        storageProducerService.updateStorageProducer(id, storageProducer.getName());
    }


}
