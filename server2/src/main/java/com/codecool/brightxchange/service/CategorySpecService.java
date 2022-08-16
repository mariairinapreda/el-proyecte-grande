package com.codecool.brightxchange.service;

import com.codecool.brightxchange.repositories.CategorySpecRepository;
import org.springframework.stereotype.Service;

@Service
public class CategorySpecService {
    private final CategorySpecRepository repository;


    public CategorySpecService(CategorySpecRepository repository) {
        this.repository = repository;
    }
}
