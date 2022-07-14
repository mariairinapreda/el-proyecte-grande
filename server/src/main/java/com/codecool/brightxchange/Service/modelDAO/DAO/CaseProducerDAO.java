package com.codecool.brightxchange.Service.modelDAO.DAO;

import com.codecool.brightxchange.model.producers.CaseProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CaseProducerDAO  extends JpaRepository<CaseProducer, Long> {
}
