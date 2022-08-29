package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.producers.ProcessorProducer;
import com.codecool.brightxchange.repositories.producers.ProcessorProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ProcessorProducerService")
public class ProcessorProducerService {
    private final ProcessorProducerDAO processorProducerDAO;

    public ProcessorProducerService(ProcessorProducerDAO processorProducerDAO) {
        this.processorProducerDAO = processorProducerDAO;
    }

    public List<ProcessorProducer> getAll(){
        return processorProducerDAO.findAll();
    }

    public Optional<ProcessorProducer> getById(long id){
        return processorProducerDAO.findById(id);
    }

    public void addProcessorProducer(ProcessorProducer tempProcessorProducer){
        processorProducerDAO.save(tempProcessorProducer);
    }

    public void updateProcessorProducer(long id, String name){
        processorProducerDAO.update(id, name);
    }
}
