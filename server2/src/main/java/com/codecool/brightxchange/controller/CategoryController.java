package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.Category;
import com.codecool.brightxchange.service.CategoryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("categories")
public class CategoryController {
    private final CategoryService service;

    public CategoryController(CategoryService service) {
        this.service = service;
    }

    @GetMapping
    private List<Category> getAll(){
        return service.selectAll();
    }

    @PostMapping
    private Category add(@RequestBody Category category){
        service.save(category);
        return service.selectLast();
    }
}
