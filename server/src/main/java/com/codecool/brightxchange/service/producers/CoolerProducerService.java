package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.CoolerProducer;
import com.codecool.brightxchange.repositories.producers.CoolerProducerDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CoolerProducerService")
public class CoolerProducerService {
    private final CoolerProducerDAO coolerProducerDAO;

    public CoolerProducerService(CoolerProducerDAO coolerProducerDAO) {
        this.coolerProducerDAO = coolerProducerDAO;
    }

    public List<CoolerProducer> getAll(){
        return coolerProducerDAO.findAll();
    }

    public Optional<CoolerProducer> getById(long id){
        return coolerProducerDAO.findById(id);
    }
    public void addCoolerProducer(CoolerProducer coolerProducer){
        coolerProducerDAO.save(coolerProducer);
    }

    public void updateCoolerProducer(long id, CoolerProducer coolerProducer){
        coolerProducerDAO.update(id, coolerProducer.getName());
    }


}
