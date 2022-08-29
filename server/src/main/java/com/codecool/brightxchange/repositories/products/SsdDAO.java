package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.products.SSD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface SsdDAO extends JpaRepository<SSD, Long> {

    @Modifying
    @Query("update SSD s set" +
            " s.quantity =:quantity," +
            " s.readSpeed = :readSpeed," +
            " s.writeSpeed = :writeSpeed, s.price =:price" +
            " where s.id= :id ")
    void update(@Param("id") long id,
                @Param("quantity") Integer quantity,
                @Param("readSpeed") Integer readSpeed,
                @Param("writeSpeed") Integer writeSpeed,
                @Param("price") float price);


    @Modifying
    @Query("update SSD s set s.supplier = :supplier where s.id = :id")
    void updateSupplier(@Param("id") float id,
                        @Param("supplier")Supplier supplier);

}
