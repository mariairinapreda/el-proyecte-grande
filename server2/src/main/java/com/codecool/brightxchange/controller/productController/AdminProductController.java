package com.codecool.brightxchange.controller.productController;

import com.codecool.brightxchange.model.*;
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
    public Product save(@RequestBody Product product){
        System.out.println(product);
        product.setCategory(categoryService.getOne(product.getCategory().getId()).get());
        // save product specs
        List<ProductSpec> productSpecs = productSpecService.addProduct(product.getProductSpecList());
        // save product
        product.setProductSpecList(productSpecs);
        product = productService.saveAndFlush(product);
        // upload Image
        System.out.println("start upload");
        List<ProductImage> productImages= uploader.uploadProductImages(product.getNameForImages());
        product.setImages(productImageService.saveAndFlush(productImages));

        System.out.println("end upload");

        // add bound
        productService.saveAndFlush(product);
        System.out.println(product);

        return product;

    }

}
