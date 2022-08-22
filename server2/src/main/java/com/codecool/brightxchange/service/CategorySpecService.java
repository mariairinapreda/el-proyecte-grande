package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.CategorySpec;
import com.codecool.brightxchange.repositories.CategorySpecRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategorySpecService {
    private final CategorySpecRepository repository;


    public CategorySpecService(CategorySpecRepository repository) {
        this.repository = repository;
    }

    public void addCategorySpec(CategorySpec categorySpec){
        repository.save(categorySpec);
    }
    public void addAllCategorySpec(List<CategorySpec> categorySpecList){
        repository.saveAll(categorySpecList);
    }


}
