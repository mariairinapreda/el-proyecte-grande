package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ChipsetProducerDAO extends JpaRepository<ChipsetProducer, Long> {
}
