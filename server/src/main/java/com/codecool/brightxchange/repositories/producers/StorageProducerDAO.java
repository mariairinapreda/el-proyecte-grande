package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.StorageProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageProducerDAO extends JpaRepository<StorageProducer, Long> {
    @Modifying
    @Query("update StorageProducer  sp set sp.name = :name where sp.id = :id")
    void update(@Param("id") float id,
                @Param("name") String name);
}
