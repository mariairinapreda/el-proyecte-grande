package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.codecool.brightxchange.model.products.Motherboard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.awt.*;

@Repository
public interface MotherboardDAO extends JpaRepository<Motherboard, Long> {
    @Modifying
    @Query("update Motherboard m set" +
            " m.price = :price," +
            " m.quantity = :quantity," +
            " m.chipset = :chipset," +
            " m.numberOfM2 = :numberOfM2," +
            " m.numberOfSATA3 = :numberOfSATA3" +
            " where m.id= :id ")
    void update(@Param("id") long id,
                @Param("price") float price,
                @Param("quantity") Integer quantity,
                @Param("chipset") String chipset,
                @Param("numberOfM2") Integer numberOfM2,
                @Param("numberOfSATA3") Integer numberOfSATA3);


    @Modifying
    @Query("update Motherboard m set m.chipsetProducer = :chipsetProducer where m.id = :id")
    void updateChipsetProducer(@Param("id") long id,
                               @Param("chipsetProducer")ChipsetProducer chipsetProducer);



    @Modifying
    @Query("update Motherboard m set m.motherboardProducer = :motherboardProducer where m.id = :id")
    void updateMotherboardProducer(@Param("id") long id,
                                   @Param("motherboardProducer")MotherboardProducer motherboardProducer
    );

    @Modifying
    @Query("update Motherboard m set m.supplier = :supplier where m.id = :id")
    void updateSupplier(@Param("id") long id,
                                   @Param("supplier") Supplier supplier
    );


}


