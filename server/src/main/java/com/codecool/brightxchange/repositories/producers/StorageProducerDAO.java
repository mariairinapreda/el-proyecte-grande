package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.StorageProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageProducerDAO extends JpaRepository<StorageProducer, Long> {
}
