package com.codecool.brightxchange.repositories.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ProcessorProducer;
import com.codecool.brightxchange.model.products.Desktop;
import com.codecool.brightxchange.model.products.Processor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorDAO extends JpaRepository<Processor, Long> {
    @Modifying
    @Query("update Processor p set" +
            " p.price = :price," +
            " p.quantity = :quantity," +
            " p.core = :core," +
            " p.frequency = :frequency," +
            " p.frequencyTurboMax = :frequencyTurboMax," +
            " p.numberOfCores = :numberOfCores," +
            " p.productionFactory = :productionFactory," +
            " p.socket = :socket," +
            " p.threads = :socket" +
            " where p.id= :id ")
    void update(@Param("id") long id,
                @Param("price") float price,
                @Param("quantity") Integer quantity,
                @Param("core") String core,
                @Param("frequency") Integer frequency,
                @Param("frequencyTurboMax") Integer frequencyTurboMax,
                @Param("numberOfCores") Integer numberOfCores,
                @Param("productionFactory") Integer productionFactory,
                @Param("socket") Integer socket,
                @Param("threads") Integer threads
                );


    @Modifying
    @Query("update Processor p set p.supplier = :supplier where p.id = :id")
    void updateSupplier(@Param("id") float id,
                        @Param("supplier") Supplier supplier);

    @Modifying
    @Query("update Processor  p set p.producer = :producer where p.id = :id")
    void updateProducer(@Param("id") float id,
                        @Param("producer")ProcessorProducer producer);


}
