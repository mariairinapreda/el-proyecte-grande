package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.repositories.producers.LaptopProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service("LaptopProducerService")
public class LaptopProducerService{
    private final LaptopProducerDAO laptopProducerDAO;

    public LaptopProducerService(LaptopProducerDAO laptopProducerDAO) {
        this.laptopProducerDAO = laptopProducerDAO;
    }

    public List<LaptopProducer> getAll(){
        return laptopProducerDAO.findAll();
    }

    public Optional<LaptopProducer> getById(long id){
        return laptopProducerDAO.findById(id);
    }

    public void addLaptopProducer(LaptopProducer tempLaptopProducer){
        laptopProducerDAO.save(tempLaptopProducer);
    }

    public void updateLaptopProducer(long id, String name){
        laptopProducerDAO.update(id, name);
    }
}
