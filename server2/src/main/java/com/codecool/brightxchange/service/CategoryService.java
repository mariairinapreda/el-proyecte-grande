package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.Category;
import com.codecool.brightxchange.repositories.CategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {

    private final CategoryRepository repository;

    public CategoryService(CategoryRepository repository) {
        this.repository = repository;
    }

    public List<Category> selectAll() {
        return repository.findAll();
    }

    public void save(Category category) {
        repository.save(category);
    }

    public Category saveAndFlush(Category category) {
        return repository.saveAndFlush(category);
    }

    public Category selectLast() {
        return repository.findTopByOrderByIdDesc();
    }

    public Optional<Category> getOne(Long id){
        return repository.findById(id);
    }

    public Category getByName(String categoryName) {
        return repository.findCategoryByNameEquals(categoryName);
    }
}
