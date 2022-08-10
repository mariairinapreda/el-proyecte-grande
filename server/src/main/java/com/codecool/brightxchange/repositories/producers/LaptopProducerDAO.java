package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.LaptopProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopProducerDAO extends JpaRepository<LaptopProducer, Long> {
    @Modifying
    @Query("update LaptopProducer lp set lp.name = :name where lp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
