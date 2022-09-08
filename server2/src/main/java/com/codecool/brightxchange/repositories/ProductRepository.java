package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.Category;
import com.codecool.brightxchange.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllByCategoryEquals(Category category);
}
