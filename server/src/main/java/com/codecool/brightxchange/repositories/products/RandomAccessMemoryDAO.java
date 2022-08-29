package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import com.codecool.brightxchange.model.products.RandomAccessMemory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RandomAccessMemoryDAO extends JpaRepository<RandomAccessMemory, Long> {

    @Modifying
    @Query("update RandomAccessMemory ram set" +
            " ram.quantity = :quantity," +
            " ram.capacity = :capacity," +
            " ram.price = :price" +
            " where ram.id= :id ")
    void update(@Param("id") long id,
                @Param("quantity") Integer quantity,
                @Param("capacity") Integer capacity,
                @Param("price") float price
    );

    @Modifying
    @Query("update RandomAccessMemory  ram set ram.supplier = :supplier where ram.id = :id")
    void updateSupplier(@Param("id") float id,
                        @Param("supplier") Supplier supplier
                        );

    @Modifying
    @Query("update RandomAccessMemory  ram set ram.memoryType = :memoryType where ram.id = :id")
    void updateMemoryType(@Param("id") float id,
                          @Param("memoryType")RandomAccessMemoryType randomAccessMemoryType);

    @Modifying
    @Query("update  RandomAccessMemory  ram set ram.ramProducer = :ramProducer where ram.id = :id")
    void updateRamProducer(@Param("id") float id,
                           @Param("ramProducer")RAMProducer ramProducer);
}
