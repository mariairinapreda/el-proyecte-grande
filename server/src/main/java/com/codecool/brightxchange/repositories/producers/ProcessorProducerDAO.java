package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.ProcessorProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorProducerDAO extends JpaRepository<ProcessorProducer, Long> {
    @Modifying
    @Query("update ProcessorProducer p set p.name = :name where p.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
