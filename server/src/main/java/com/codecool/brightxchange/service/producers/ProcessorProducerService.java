package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.ProcessorProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ProcessorProducerService")
public class ProcessorProducerService {
    private final ProcessorProducerDAO processorProducerDAO;

    public ProcessorProducerService(ProcessorProducerDAO processorProducerDAO) {
        this.processorProducerDAO = processorProducerDAO;
    }
}
