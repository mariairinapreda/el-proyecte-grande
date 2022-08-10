package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.repositories.producers.RAMProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("RAMProducerService")
public class RAMProducerService {
    private final RAMProducerDAO ramProducerDAO;

    public RAMProducerService(RAMProducerDAO ramProducerDAO) {
        this.ramProducerDAO = ramProducerDAO;
    }

    public List<RAMProducer> getAll(){
        return ramProducerDAO.findAll();
    }

    public Optional<RAMProducer> getById(long id){
        return ramProducerDAO.findById(id);
    }

    public void addRAMProducer(RAMProducer tempRAMProducer){
        ramProducerDAO.save(tempRAMProducer);
    }

    public void updateRAMProducer(long id, String name){
        ramProducerDAO.update(id, name);
    }
}
