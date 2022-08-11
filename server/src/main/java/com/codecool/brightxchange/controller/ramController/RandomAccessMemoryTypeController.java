package com.codecool.brightxchange.controller.ramController;

import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import com.codecool.brightxchange.service.types.RandomAccessMemoryTypeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/random-access-memory-type")
public class RandomAccessMemoryTypeController {
    private final RandomAccessMemoryTypeService randomAccessMemoryTypeService;

    public RandomAccessMemoryTypeController(RandomAccessMemoryTypeService randomAccessMemoryTypeService) {
        this.randomAccessMemoryTypeService = randomAccessMemoryTypeService;
    }

    @GetMapping
    public List<RandomAccessMemoryType> getAll(){
        return randomAccessMemoryTypeService.getAll();
    }

    @GetMapping("{id}")
    public RandomAccessMemoryType getById(@PathVariable("id") Long id){
        return randomAccessMemoryTypeService.getById(id).get();
    }

    @PostMapping
    public void addRamType(@RequestBody RandomAccessMemoryType randomAccessMemoryType){
        randomAccessMemoryTypeService.addRamType(randomAccessMemoryType);
    }

    @PutMapping("{id}")
    public void updateRamType(@PathVariable("id")long id, @RequestBody RandomAccessMemoryType randomAccessMemoryType){
        randomAccessMemoryTypeService.updateRam(id, randomAccessMemoryType);}

}
