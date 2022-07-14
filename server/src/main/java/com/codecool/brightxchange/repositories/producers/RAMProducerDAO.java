package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.RAMProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RAMProducerDAO extends JpaRepository<RAMProducer, Long> {
}
