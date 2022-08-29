package com.codecool.brightxchange.service.categories;

import com.codecool.brightxchange.model.categories.Category;
import com.codecool.brightxchange.repositories.categories.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final CategoryDAO categoryDAO;

    public CategoryService(CategoryDAO categoryDAO) {
        this.categoryDAO = categoryDAO;
    }

    public List<Category> getAll(){
        return categoryDAO.findAll();
    }

}
