package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.categories.Category;
import com.codecool.brightxchange.service.categories.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/categories")
public class CategoryController {
    @Autowired
    private CategoryService service;

    @GetMapping
    public List<Category> getAll(){
        return service.getAll();
    }
}
