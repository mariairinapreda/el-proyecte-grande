package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findTopByOrderByIdDesc();

    Category findCategoryByNameEquals(String name);
}
