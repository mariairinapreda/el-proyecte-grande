package com.codecool.brightxchange.controller.motherboardController;


import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.codecool.brightxchange.model.products.Motherboard;
import com.codecool.brightxchange.service.products.MotherboardService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/mother-board")
public class MotherBoardController {
    private final MotherboardService motherboardService;


    public MotherBoardController(MotherboardService motherboardService) {
        this.motherboardService = motherboardService;
    }

    @GetMapping
    public List<Motherboard> getAll(){
        return motherboardService.getAll();
    }

    @GetMapping("{id}")
    public Motherboard getById(@PathVariable("id") Long id){
        return motherboardService.getById(id).get();
    }

    @PostMapping
    public void addMotherBoard(@RequestBody Motherboard motherboard){
        motherboardService.addMotherboard(motherboard);
    }

    @PutMapping("{id}")
    public void updateMotherBoard(@PathVariable("id")long id, Motherboard motherboard){
        motherboardService.updateMotherboard(id, motherboard.getPrice(),
                motherboard.getQuantity(),
                motherboard.getChipset(),
                motherboard.getNumberOfM2(),
                motherboard.getNumberOfSATA3());
    }

    @PutMapping("{id}")
    public void updateSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        motherboardService.updateSupplier(id, supplier);
    }

    @PutMapping("{id}")
    public void updateProducer(@PathVariable("id")long id, @RequestBody MotherboardProducer motherboardProducer){
        motherboardService.updateMotherboardProducer(id, motherboardProducer);
    }
    @PutMapping("{id}")
    public void updateChipsetProducer(@PathVariable("id")long id, @RequestBody ChipsetProducer chipsetProducer){
        motherboardService.updateChipsetProducer(id, chipsetProducer);
    }


}
