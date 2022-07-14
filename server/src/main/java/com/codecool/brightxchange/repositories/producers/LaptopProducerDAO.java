package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.LaptopProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LaptopProducerDAO extends JpaRepository<LaptopProducer, Long> {
}
