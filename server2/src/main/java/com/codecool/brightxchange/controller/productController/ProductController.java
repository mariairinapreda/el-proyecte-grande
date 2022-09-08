package com.codecool.brightxchange.controller.productController;

import com.codecool.brightxchange.model.Category;
import com.codecool.brightxchange.model.Product;
import com.codecool.brightxchange.service.CategoryService;
import com.codecool.brightxchange.service.ProductImageService;
import com.codecool.brightxchange.service.ProductService;
import com.codecool.brightxchange.service.ProductSpecService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("products")
public class ProductController {
    private final ProductImageService productImageService;
    private final ProductSpecService productSpecService;
    private final ProductService productService;
    private final CategoryService categoryService;


    public ProductController(ProductImageService productImageService,
                             ProductSpecService productSpecService,
                             ProductService productService, CategoryService categoryService) {
        this.productImageService = productImageService;
        this.productSpecService = productSpecService;
        this.productService = productService;
        this.categoryService = categoryService;
    }

//    public void addProduct(Product product) {
//        productService.addProductService(product);
//    }

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAll();
    }

    @GetMapping("{id}")
    public Product getOneProduct(@PathVariable("id") Long id) {
        return productService.getProductById(id).get();
    }


    @GetMapping("/category/{categoryName}")
    public List<Product> getByCategoryName(@PathVariable("categoryName") String categoryName) {
        Category category = categoryService.getByName(categoryName);
        return productService.getByCategory(category);
    }


}
