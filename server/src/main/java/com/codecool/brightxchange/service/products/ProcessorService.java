package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ProcessorProducer;
import com.codecool.brightxchange.model.products.Processor;
import com.codecool.brightxchange.repositories.products.ProcessorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ProcessorService")
public class ProcessorService {
    private final ProcessorDAO processorDAO;

    public ProcessorService(ProcessorDAO processorDAO) {
        this.processorDAO = processorDAO;
    }

    public List<Processor> getAll(){
        return processorDAO.findAll();
    }

    public Optional<Processor> getById(long id){
        return processorDAO.findById(id);
    }

    public void addProcessor(Processor tempProcessor){
        processorDAO.save(tempProcessor);
    }

    public void updateProcessor(long id,
                                float price,
                                Integer quantity,
                                String core,
                                Integer frequency,
                                Integer frequencyTurboMax,
                                Integer numberOfCores,
                                Integer productionFactory,
                                Integer socket,
                                Integer threads){
        processorDAO.update(id,
                price,
                quantity,
                core,
                frequency,
                frequencyTurboMax,
                numberOfCores,
                productionFactory,
                socket,
                threads );
    }

    public void updateSupplier(long id, Supplier supplier){
        processorDAO.updateSupplier(id, supplier);
    }

    public void updateProducer(long id, ProcessorProducer producer){
        processorDAO.updateProducer(id, producer);
    }


}
