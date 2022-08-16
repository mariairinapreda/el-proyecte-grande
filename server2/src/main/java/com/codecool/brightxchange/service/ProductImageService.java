package com.codecool.brightxchange.service;

import com.codecool.brightxchange.repositories.ProductImageRepository;
import org.springframework.stereotype.Service;

@Service
public class ProductImageService {

    private final ProductImageRepository repository;

    public ProductImageService(ProductImageRepository repository) {
        this.repository = repository;
    }
}
