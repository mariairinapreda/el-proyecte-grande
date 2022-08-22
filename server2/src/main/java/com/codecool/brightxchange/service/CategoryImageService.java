package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.CategoryImage;
import com.codecool.brightxchange.repositories.CategoryImageRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryImageService {

    private final CategoryImageRepository repository;

    public CategoryImageService(CategoryImageRepository repository) {
        this.repository = repository;
    }


    public void addCategoryImageService(CategoryImage categoryImage) {
        repository.save(categoryImage);
    }

    public CategoryImage saveAndFlush(CategoryImage categoryImage) {
        return repository.saveAndFlush(categoryImage);
    }


}
