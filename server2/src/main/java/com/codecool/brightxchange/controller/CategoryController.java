package com.codecool.brightxchange.controller;

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
    private final CategoryImageService imageService;
    private final CategorySpecService specService;
    private final S3ImageUploader uploader;

    public CategoryController(CategoryService service, CategoryImageService imageService, CategorySpecService specService, S3ImageUploader uploader) {
        this.service = service;
        this.imageService = imageService;
        this.specService = specService;
        this.uploader = uploader;
    }

    @GetMapping
    private List<Category> getAll() {
        return service.selectAll();
    }

    @PostMapping
    private Category add(@RequestBody Category category) {
        // save category specs
        List<CategorySpec> categorySpecs = specService.saveAllAndFlush(category.getCategorySpecs());
        category.setCategorySpecs(categorySpecs);
        // update category
//        category = service.saveAndFlush(category);
        // upload Image
        System.out.println("start upload");
        CategoryImage categoryImage = uploader.uploadCategoryImage(category.getImageName());
        System.out.println("end upload");
        System.out.println(categoryImage);
        // add bound
//        categoryImage.setCategory(category);
        // save image details and update category

        category.setImage(imageService.saveAndFlush(categoryImage));

        service.saveAndFlush(category);
        System.out.println(category);

        return category;
    }
}
