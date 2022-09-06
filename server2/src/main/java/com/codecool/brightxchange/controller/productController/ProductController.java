package com.codecool.brightxchange.controller.productController;

import com.codecool.brightxchange.model.Product;
import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.ProductImageService;
import com.codecool.brightxchange.service.ProductService;
import com.codecool.brightxchange.service.ProductSpecService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductImageService productImageService;
    private final ProductSpecService productSpecService;
    private final ProductService productService;


    public ProductController(ProductImageService productImageService,
                             ProductSpecService productSpecService,
                             ProductService productService) {
        this.productImageService = productImageService;
        this.productSpecService = productSpecService;
        this.productService = productService;
    }

    public void addProduct(Product product) {
        productService.addProductService(product);
    }
}
