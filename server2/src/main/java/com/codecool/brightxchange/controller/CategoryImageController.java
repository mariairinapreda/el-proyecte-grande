package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.CategoryImageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api/admin/category-images")
public class CategoryImageController {
    private final S3ImageUploader uploader;
    private final CategoryImageService categoryImageService;


    public CategoryImageController(S3ImageUploader uploader, CategoryImageService categoryImageService) {
        this.uploader = uploader;
        this.categoryImageService = categoryImageService;
    }

    @DeleteMapping
    public void clear() {
        uploader.clearImages();
    }

    @PostMapping
    public void imageUploader(@RequestParam("image") MultipartFile image) {
        uploader.saveCategoryImage(image);
        System.out.println("saved");
    }

}
