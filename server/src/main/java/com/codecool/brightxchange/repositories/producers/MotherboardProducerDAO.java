package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.MotherboardProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MotherboardProducerDAO extends JpaRepository<MotherboardProducer, Long> {
}
