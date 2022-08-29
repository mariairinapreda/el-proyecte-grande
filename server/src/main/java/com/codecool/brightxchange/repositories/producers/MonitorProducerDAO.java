package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorProducerDAO extends JpaRepository<MonitorProducer, Long> {
    @Modifying
    @Query("update MonitorProducer mp set mp.name = :name where mp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
