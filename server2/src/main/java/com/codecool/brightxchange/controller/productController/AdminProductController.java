package com.codecool.brightxchange.controller.productController;

import com.codecool.brightxchange.model.*;
import com.codecool.brightxchange.s3Upload.S3ImageUploader;
import com.codecool.brightxchange.service.ProductImageService;
import com.codecool.brightxchange.service.ProductService;
import com.codecool.brightxchange.service.ProductSpecService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/api/admin/product")
public class AdminProductController {
    private final ProductImageService productImageService;
    private final ProductSpecService productSpecService;
    private final ProductService productService;
    private final S3ImageUploader uploader;

    public AdminProductController(ProductImageService productImageService,
                                  ProductSpecService productSpecService,
                                  ProductService productService,
                                  S3ImageUploader uploader) {
        this.productImageService = productImageService;
        this.productSpecService = productSpecService;
        this.productService = productService;
        this.uploader = uploader;
    }
    @PostMapping
    public Product save(@RequestBody Product product){
        // save category specs
        List<ProductSpec> productSpecs = productSpecService.addProduct(product.getProductSpecList());
        product.setProductSpecList(productSpecs);
        // update category
//        category = service.saveAndFlush(category);
        // upload Image
        System.out.println("start upload");
        List<ProductImage> productImages=new ArrayList<>();
        for (String image : product.getImageNames()) {
            ProductImage productImage = uploader.uploadProductImage(image);
            productImages.add(productImage);

        }
        product.setImages(productImageService.saveAndFlush(productImages));

        System.out.println("end upload");
        // add bound
//        categoryImage.setCategory(category);
        // save image details and update category


        productService.saveAProduct(product);
        System.out.println(product);

        return product;

    }

}
