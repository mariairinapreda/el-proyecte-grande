package com.codecool.brightxchange.Service.modelDAO.DAO;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.ProcessorProducer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProcessorProducerDAO extends JpaRepository<ProcessorProducer, Long> {
}
