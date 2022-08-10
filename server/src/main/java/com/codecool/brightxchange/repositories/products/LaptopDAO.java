package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopDAO extends JpaRepository<Laptop, Long> {

    @Modifying
    @Query("update Laptop l set" +
            " l.price = :price," +
            " l.dimensions = :dimensions," +
            " l.weight = :weight," +
            " l.quantity = :quantity" +
            " where l.id = :id")
    void update(@Param("id") long id,
                @Param("price") float price,
                @Param("weight") Integer weight,
                @Param("quantity") Integer quantity);

    @Modifying
    @Query("update Laptop  l set l.supplier = :supplier where l.id = :id")
    void updateSupplier(@Param("id") float id,
                        @Param("supplier")Supplier supplier);


    @Modifying
    @Query("update Laptop l set l.backPanel = :backPanel where l.id = :id")
    void updateVideoBackPanel(@Param("id") float id,
                        @Param("backPanel")VideoBackPanel backPanel);


    @Modifying
    @Query("update Laptop l set l.connectivity = :backPanel where l.id = :id")
    void updateConnectivity(@Param("id") float id,
                        @Param("connectivity") Connectivity connectivity);

    @Modifying
    @Query("update Laptop l set l.display = :display where l.id = :id")
    void updateDisplay(@Param("id") float id,
                        @Param("display") Display display);

    @Modifying
    @Query("update Laptop l set l.graphicsCard = :graphicsCard where l.id = :id")
    void updateGraphicsCard(@Param("id") float id,
                        @Param("graphicsCard") GraphicsCard graphicsCard);

    @Modifying
    @Query("update Laptop l set l.laptopProducer= :laptopProducer where l.id = :id")
    void updateLaptopProducer(@Param("id") float id,
                        @Param("laptopProducer") LaptopProducer laptopProducer);

    @Modifying
    @Query("update Laptop l set l.memory = :memory where l.id = :id")
    void updateMemory(@Param("id") float id,
                        @Param("memory") RandomAccessMemory memory);

    @Modifying
    @Query("update Laptop l set l.processor = :processor where l.id = :id")
    void updateProcessor(@Param("id") float id,
                        @Param("processor") Processor processor);

    @Modifying
    @Query("update Laptop l set l.storage = :storage where l.id = :id")
    void updateStorage(@Param("id") float id,
                        @Param("backPanel") Storage storage);
}
