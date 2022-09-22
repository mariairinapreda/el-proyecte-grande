package com.codecool.brightxchange.controller.productController;

import com.codecool.brightxchange.model.*;
import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/admin/products")
public class AdminProductController {
    private final ProductService productService;
    private final ProducerService producerService;
    private final CategoryService categoryService;
    private final CategorySpecService categorySpecService;
    private final S3ImageUploader uploader;

    public AdminProductController(ProductService productService,
                                  ProducerService producerService,
                                  CategoryService categoryService,
                                  CategorySpecService categorySpecService,
                                  S3ImageUploader uploader) {
        this.productService = productService;
        this.producerService = producerService;
        this.categoryService = categoryService;
        this.categorySpecService = categorySpecService;
        this.uploader = uploader;
    }

    @PostMapping
    public Product save(@RequestBody Product product) {
        Category category = categoryService.getByName(product.getCategory().getName());

        List<ProductSpec> productSpecs = product.getProductSpecList();
        for (ProductSpec spec : productSpecs) {
            spec.setCategorySpec(categorySpecService.getById(spec.getCategorySpec().getId()));
        }

        List<ProductImage> images = uploader.uploadProductImages(product.getNameForImages());

        Producer producer = producerService.addProducerService(product.getProducer());
        product.setCategory(category);
        product.setProducer(producer);
        product.setProductSpecList(productSpecs);
        product.setImages(images);
        product = productService.saveAProduct(product);

        return product;

    }

}
