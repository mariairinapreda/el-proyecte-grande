package com.codecool.brightxchange.controller.storageController;

import com.codecool.brightxchange.model.products.Storage;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/storage")
public class StorageController {

    @GetMapping
    public List<Storage> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Storage getById(@PathVariable("id") Long id){
        return null;
    }

}
