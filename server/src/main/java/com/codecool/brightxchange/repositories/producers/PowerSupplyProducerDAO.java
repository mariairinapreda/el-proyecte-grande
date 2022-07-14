package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PowerSupplyProducerDAO extends JpaRepository<PowerSupplyProducer, Long> {
}
