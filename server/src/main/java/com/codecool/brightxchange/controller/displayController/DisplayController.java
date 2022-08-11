package com.codecool.brightxchange.controller.displayController;

import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.service.products.DisplayService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/display")
public class DisplayController {

    private DisplayService displayService;


    public DisplayController(DisplayService displayService) {
        this.displayService = displayService;
    }

    @GetMapping
    public List<Display> getAll(){
        return displayService.getAll();
    }

    @GetMapping("{id}")
    public Display getById(@PathVariable("id") Long id){
        return displayService.getDisplayById(id).orElse(null);
    }

    @PostMapping
    public void saveNewDisplay(@RequestBody Display display){
        displayService.addDisplay(display);
    }

    @PutMapping("{id}")
    public void updateDisplay(@PathVariable("id") Long id, @RequestBody Display display){
        displayService.updateDisplay(id, display);
    }


}
