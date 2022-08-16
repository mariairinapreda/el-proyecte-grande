package com.codecool.brightxchange.service;

import com.codecool.brightxchange.repositories.CategoryImageRepository;
import org.springframework.stereotype.Service;

@Service
public class CategoryImageService {

    private final CategoryImageRepository repository;

    public CategoryImageService(CategoryImageRepository repository) {
        this.repository = repository;
    }
}
