package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.repositories.producers.ChipsetProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ChipsetProducerService")
public class ChipsetProducerService {
    private final ChipsetProducerDAO chipsetProducerDAO;

    public ChipsetProducerService(ChipsetProducerDAO chipsetProducerDAO) {
        this.chipsetProducerDAO = chipsetProducerDAO;
    }

    public List<ChipsetProducer> getAll(){
        return chipsetProducerDAO.findAll();
    }

    public Optional<ChipsetProducer> getById(long id){
        return chipsetProducerDAO.findById(id);
    }

    public void addChipsetProducer(ChipsetProducer tempChipsetProducer){
        chipsetProducerDAO.save(tempChipsetProducer);
    }

    public void updateChipsetProducer(long id, String name){
        chipsetProducerDAO.update(id, name);
    }
}
