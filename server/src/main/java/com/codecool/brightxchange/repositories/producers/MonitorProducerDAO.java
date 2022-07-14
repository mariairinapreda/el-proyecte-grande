package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MonitorProducerDAO extends JpaRepository<MonitorProducer, Long> {
}
