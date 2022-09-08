package com.codecool.brightxchange.service;

import com.codecool.brightxchange.model.Product;
import com.codecool.brightxchange.repositories.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductRepository repository;

    public ProductService(ProductRepository repository) {
        this.repository = repository;
    }

    public void addProductService(Product product) {
        repository.save(product);

    }
public Product saveAProduct(Product product){
        return repository.saveAndFlush(product);
}
public List<Product> getAll(){
        return repository.findAll();
}
public Optional<Product> getProductById(Long id){
        return repository.findById(id);
}
}
