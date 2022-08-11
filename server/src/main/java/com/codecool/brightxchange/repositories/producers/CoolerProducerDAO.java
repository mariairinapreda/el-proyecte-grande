package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.CoolerProducer;
import com.codecool.brightxchange.model.products.Cooler;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CoolerProducerDAO extends JpaRepository<CoolerProducer, Long> {
    @Modifying
    @Query("update CoolerProducer cp set cp.name = :name where cp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);


}
