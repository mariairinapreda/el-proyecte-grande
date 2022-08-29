package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
