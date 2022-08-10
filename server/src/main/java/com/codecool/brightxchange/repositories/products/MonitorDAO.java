package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.Monitor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorDAO extends JpaRepository<Monitor, Long> {
    @Modifying
    @Query("update Monitor m set " +
            "m.price = :price," +
            " m.quantity = :quantity," +
            " m.power = :power," +
            " m.diagonal = :diagonal," +
            " m.dimensions = :dimensions," +
            " m.refreshRate= :refreshRate," +
            " m.responseTime = :responseTime," +
            " m.weight = :responseTime" +
            " where m.id= :id ")
    void update(@Param("id") long id,
                @Param("price") float price,
                @Param("quantity") Integer quantity,
                @Param("power") Integer power,
                @Param("diagonal") Integer diagonal,
                @Param("dimensions") Integer dimensions,
                @Param("refreshRate") Integer refreshRate,
                @Param("responseTime") Integer responseTime,
                @Param("weight") Integer weight
                );

    @Modifying
    @Query("update Monitor m set m.monitorProducer = :monitorProducer where m.id =:id")
    void updateProducer(@Param("id") long id,
                        @Param("monitorProducer") MonitorProducer monitorProducer);

    @Modifying
    @Query("update Monitor m set m.backPanel = :backPanel where m.id =:id")
    void updateVideoBackPanel(@Param("id") long id,
                        @Param("monitorProducer") VideoBackPanel backPanel);

    @Modifying
    @Query("update Monitor m set m.supplier = :supplier where m.id =:id")
    void updateSupplier(@Param("id") long id,
                        @Param("supplier") Supplier supplier);






}
