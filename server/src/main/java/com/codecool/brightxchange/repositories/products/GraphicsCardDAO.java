package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.model.productRelated.*;
import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import com.codecool.brightxchange.model.products.GraphicsCard;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardDAO extends JpaRepository<GraphicsCard, Long> {
    @Modifying
    @Query("update GraphicsCard gc set  gc.currency= :currency, " +
            " gc.price= :price," +
            " gc.quantity= :quantity," +
            " gc.busMemory= :busMemory," +
            " gc.frequency= :frequency," +
            " gc.resolution= :resolution," +
            " gc.videoMemory= :videoMemory," +
            " gc.other= :other" +
            " where gc.id= :id ")
    void update(@Param("id") long id,
                @Param("currency") PriceCurrency currency,
                @Param("price")Float price,
                @Param("quantity")int quantity,
                @Param("busMemory") int busMemory,
                @Param("frequency")int frequency,
                @Param("resolution")String resolution,
                @Param("videoMemory")int videoMemory,
                @Param("other")String other);



    @Modifying
    @Query("update GraphicsCard gr set gr.backPanel= :backPanel  where gr.id= :id ")
    void updateVideoBackPanel(@Param("id") long id, @Param("backPanel") VideoBackPanel backPanel);

    @Modifying
    @Query("update GraphicsCard gr set gr.supplier= :supplier  where gr.id= :id ")
    void updateSupplier(@Param("id") long id, @Param("supplier") Supplier supplier);


    @Modifying
    @Query("update GraphicsCard gr set gr.family= :family  where gr.id= :id ")
    void updateGraphicsCardFamily(@Param("id") long id, @Param("family") GraphicsCardFamily family);

    @Modifying
    @Query("update GraphicsCard gr set gr.model= :model  where gr.id= :id ")
    void updateModel(@Param("id") long id, @Param("model") GCModel model);

    @Modifying
    @Query("update GraphicsCard gr set gr.gcConnectionInterface= :gcConnectionInterface  where gr.id= :id ")
    void updateConnectionInterface(@Param("id") long id, @Param("gcConnectionInterface") GCConnectionInterface gcConnectionInterface);

    @Modifying
    @Query("update GraphicsCard gr set gr.gcSeries= :gcSeries  where gr.id= :id ")
    void updateSeries(@Param("id") long id, @Param("gcSeries") GCSeries gcSeries);

    @Modifying
    @Query("update GraphicsCard gr set gr.memoryType= :memoryType  where gr.id= :id ")
    void updateGraphicsCardMemoryType(@Param("id") long id, @Param("memoryType") GraphicsCardMemoryType memoryType);

    @Modifying
    @Query("update GraphicsCard gr set gr.producer= :producer  where gr.id= :id ")
    void updateProducer(@Param("id") long id, @Param("producer") GraphicsCardProducer producer);


}



