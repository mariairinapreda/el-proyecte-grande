package com.codecool.brightxchange.repositories;

import com.codecool.brightxchange.model.Category;
import com.codecool.brightxchange.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> getAllByCategoryEquals(Category category);

    @Query("update Product p set p.quantity= ?2 where p.id= ?1 ")
    void updateNumberOfProducts(Long productId,int quantity);

    @Query("select p from Product p where p.name like ?1")
    List<Product> findAllProductsByName(String searchText);

    @Query("select p from Product p where p.name like ?1 and p.price >= ?2 and p.price<= ?3 and p.producer.name in ?4 and p.category.name in ?5 ")
    List<Product> findAllSimpleFiltered(String searchText,
                                        Integer minPrice,
                                        Integer maxPrice,
                                        List<String> producers,
                                        List<String> categories);
}
