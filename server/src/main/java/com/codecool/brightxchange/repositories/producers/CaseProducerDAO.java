package com.codecool.brightxchange.repositories.producers;

import com.codecool.brightxchange.model.producers.CaseProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseProducerDAO  extends JpaRepository<CaseProducer, Long> {
}
