package com.codecool.brightxchange.controller.ramController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import com.codecool.brightxchange.model.products.RandomAccessMemory;
import com.codecool.brightxchange.service.products.RAMService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/random-access-memory")
public class RandomAccessMemoryController {
    private final RAMService ramService;

    public RandomAccessMemoryController(RAMService ramService) {
        this.ramService = ramService;
    }

    @GetMapping
    public List<RandomAccessMemory> getAll(){
        return ramService.getAll();
    }

    @GetMapping("{id}")
    public RandomAccessMemory getById(@PathVariable("id") Long id){
        return ramService.getById(id).get();
    }

    @PostMapping
    public void addRam(@RequestBody RandomAccessMemory randomAccessMemory){
        ramService.addRandomAccessMemory(randomAccessMemory);
    }

    @PutMapping("{id}")
    public void updateRam(@PathVariable("id")long id, @RequestBody RandomAccessMemory randomAccessMemory){
        ramService.updateRandomAccessMemory(id, randomAccessMemory.getQuantity(),
                randomAccessMemory.getCapacity(),
                randomAccessMemory.getPrice());
    }

    @PutMapping("{id}/supplier")
    public void updateSupplier(@PathVariable("id")long id, Supplier supplier){
        ramService.updateSupplier(id, supplier);
    }

    @PutMapping("{id}/memory-type")
    public  void updateRamType(@PathVariable("id")long id, @RequestBody RandomAccessMemoryType randomAccessMemoryType){
        ramService.updateMemoryType(id, randomAccessMemoryType);
    }

    @PutMapping("{id}/ram-producer")
    public void updateRamProducer(@PathVariable("id")long id, @RequestBody RAMProducer ramProducer){
        ramService.updateRamProducer(id, ramProducer);
    }

}
