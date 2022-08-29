package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@CrossOrigin
@RestController
@RequestMapping("category-images")
public class CategoryImageController {
    private final S3ImageUploader uploader;

    public CategoryImageController(S3ImageUploader uploader) {
        this.uploader = uploader;
    }

    @PostMapping
    public void imageUploader(@RequestParam("image") MultipartFile image) {
        uploader.saveCategoryImage(image);
        System.out.println("saved");
    }
}
