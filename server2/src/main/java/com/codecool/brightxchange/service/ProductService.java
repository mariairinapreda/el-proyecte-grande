package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.Product;
import com.codecool.brightxchange.repositories.ProductRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProductService(Product product) {
        repository.save(product);

    }
}
