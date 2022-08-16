package com.codecool.brightxchange.service;

import com.codecool.brightxchange.repositories.ProductSpecRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductSpecService {
    private final ProductSpecRepository repository;

    public ProductSpecService(ProductSpecRepository repository) {
        this.repository = repository;
    }
}
