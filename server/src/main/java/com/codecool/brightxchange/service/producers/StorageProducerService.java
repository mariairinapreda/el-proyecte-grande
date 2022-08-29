package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.producers.StorageProducer;
import com.codecool.brightxchange.repositories.producers.StorageProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("StorageProducerService")
public class StorageProducerService {
    private final StorageProducerDAO storageProducerDAO;

    public StorageProducerService(StorageProducerDAO storageProducerDAO) {
        this.storageProducerDAO = storageProducerDAO;
    }

    public List<StorageProducer> getAll(){
        return storageProducerDAO.findAll();
    }

    public Optional<StorageProducer> getById(long id){
        return storageProducerDAO.findById(id);
    }

    public void addStorageProducer(StorageProducer tempStorageProducer){
        storageProducerDAO.save(tempStorageProducer);
    }

    public void updateStorageProducer(long id, String name){
        storageProducerDAO.update(id, name);
    }
}
