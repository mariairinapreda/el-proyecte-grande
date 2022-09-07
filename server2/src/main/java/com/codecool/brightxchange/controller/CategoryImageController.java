package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.CategoryImage;
import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.CategoryImageService;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/admin/category-images")
public class CategoryImageController {
    private final S3ImageUploader uploader;
    private final CategoryImageService categoryImageService;


    public CategoryImageController(S3ImageUploader uploader, CategoryImageService categoryImageService) {
        this.uploader = uploader;
        this.categoryImageService = categoryImageService;
    }

  @GetMapping
    public List<CategoryImage> getAll(){
        return categoryImageService.getAllImages();
  }
  @GetMapping("{id}")
    public CategoryImage getOne(@PathVariable("id")Long id){
        return categoryImageService.getById(id).get();
  }

    @PostMapping
    public void imageUploader(@RequestParam("image") MultipartFile image) {
        uploader.saveCategoryImage(image);
        System.out.println("saved");
    }

}
