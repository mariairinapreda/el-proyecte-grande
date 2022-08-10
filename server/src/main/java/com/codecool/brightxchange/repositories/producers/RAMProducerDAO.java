package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.RAMProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface RAMProducerDAO extends JpaRepository<RAMProducer, Long> {
    @Modifying
    @Query("update RAMProducer ramp set ramp.name = :name where ramp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
