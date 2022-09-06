package com.codecool.brightxchange.controller.categoryController;

import com.codecool.brightxchange.model.Category;
import com.codecool.brightxchange.model.CategoryImage;
import com.codecool.brightxchange.model.CategorySpec;
import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.CategoryImageService;
import com.codecool.brightxchange.service.CategoryService;
import com.codecool.brightxchange.service.CategorySpecService;
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
    private List<Category> getAll() {
        return service.selectAll();
    }

    @GetMapping("{id}")
    public Category getById(@PathVariable("id") Long id) {
        return service.getOne(id).get();
    }
}
