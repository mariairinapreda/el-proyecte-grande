package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.StorageProducer;
import com.codecool.brightxchange.model.products.HDD;
import com.codecool.brightxchange.model.products.SSD;
import com.codecool.brightxchange.model.products.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageDAO extends JpaRepository<Storage, Long> {
    @Modifying
    @Query("update Storage s set" +
            " s.price= :price," +
            " s.capacity = :capacity," +
            " s.quantity = :quantity" +
            " where s.id= :id ")
    void update(@Param("id") long id,
                @Param("price") float price,
                @Param("capacity") Integer capacity,
                @Param("quantity") Integer quantity);


    @Modifying
    @Query("update Storage  s set s.supplier = :supplier where s.id = :id")
    void updateSupplier(@Param("id") float id,
                        @Param("supplier")Supplier supplier);

    @Modifying
    @Query("update Storage  s set s.storageProducer = :storageProducer where s.id = :id")
    void updateStorageProducer(@Param("id") float id,
                               @Param("storageProducer")StorageProducer storageProducer);

    @Modifying
    @Query("update Storage s set s.ssd =:ssd where s.id = :id")
    void updateSSD(@Param("id") float id,
                   @Param("ssd") SSD ssd);

    @Modifying
    @Query("update Storage s set s.hdd =:hdd where s.id = :id")
    void updateHDD(@Param("id") float id,
                   @Param("hdd") HDD hdd);
}
