package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.ProcessorProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("ProcessorProducerService")
public class ProcessorProducerService {
    @Autowired
    @Qualifier("ProcessorProducerMemory")
    private ProcessorProducerDAO processorProducerDAO;
}
