package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.MotherboardProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardProducerDAO extends JpaRepository<MotherboardProducer, Long> {
    @Modifying
    @Query("update MotherboardProducer mp set mp.name = :name where mp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
