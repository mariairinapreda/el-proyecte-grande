package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipsetProducerDAO extends JpaRepository<ChipsetProducer, Long> {
    @Modifying
    @Query("update ChipsetProducer cp set cp.name = :name where cp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
