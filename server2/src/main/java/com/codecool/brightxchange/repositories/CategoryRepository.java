package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.beans.Transient;


public interface CategoryRepository extends JpaRepository<Category, Long> {

    @Transient
    Category findTopByOrderByIdDesc();
}
