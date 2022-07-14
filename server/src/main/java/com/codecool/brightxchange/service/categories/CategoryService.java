package com.codecool.brightxchange.service.categories;

import com.codecool.brightxchange.repositories.categories.CategoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {
    @Autowired
    private CategoryDAO categoryDAO;

}
