package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GraphicsCardProducerDAO extends JpaRepository<GraphicsCardProducer, Long> {
}
