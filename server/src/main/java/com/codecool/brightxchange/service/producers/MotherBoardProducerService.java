package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.codecool.brightxchange.repositories.producers.MotherboardProducerDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("MotherBoardProducerService")
public class MotherBoardProducerService {
    private final MotherboardProducerDAO motherboardProducerDAO;

    public MotherBoardProducerService(MotherboardProducerDAO motherboardProducerDAO) {
        this.motherboardProducerDAO = motherboardProducerDAO;
    }

    public List<MotherboardProducer> getAll(){
        return motherboardProducerDAO.findAll();
    }

    public Optional<MotherboardProducer> getById(long id){
        return motherboardProducerDAO.findById(id);
    }

    public void addMotherBoardProducer(MotherboardProducer motherboardProducer){
        motherboardProducerDAO.save(motherboardProducer);
    }

    public void updateMotherBoardProducer(long id, MotherboardProducer motherboardProducer){
        motherboardProducerDAO.update(id, motherboardProducer.getName());
    }



}
