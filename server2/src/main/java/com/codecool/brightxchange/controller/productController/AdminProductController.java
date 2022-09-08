package com.codecool.brightxchange.controller.productController;

import com.codecool.brightxchange.model.Product;
import com.codecool.brightxchange.model.ProductImage;
import com.codecool.brightxchange.model.ProductSpec;
import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.CategoryService;
import com.codecool.brightxchange.service.ProductImageService;
import com.codecool.brightxchange.service.ProductService;
import com.codecool.brightxchange.service.ProductSpecService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/admin/products")
public class AdminProductController {
    private final ProductImageService productImageService;
    private final ProductSpecService productSpecService;
    private final ProductService productService;
    private final CategoryService categoryService;
    private final S3ImageUploader uploader;

    public AdminProductController(ProductImageService productImageService,
                                  ProductSpecService productSpecService,
                                  ProductService productService,
                                  CategoryService categoryService, S3ImageUploader uploader) {
        this.productImageService = productImageService;
        this.productSpecService = productSpecService;
        this.productService = productService;
        this.categoryService = categoryService;
        this.uploader = uploader;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {


        return product;

    }

}
