package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.StorageProducer;
import com.codecool.brightxchange.model.products.HDD;
import com.codecool.brightxchange.model.products.SSD;
import com.codecool.brightxchange.model.products.Storage;
import com.codecool.brightxchange.repositories.products.StorageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("StorageService")
public class StorageService {

    private final StorageDAO storageDAO;

    public StorageService(StorageDAO storageDAO) {
        this.storageDAO = storageDAO;
    }

    public List<Storage> getAll(){
        return storageDAO.findAll();
    }

    public Optional<Storage> getById(long id){
        return storageDAO.findById(id);
    }

    public void addStorage(Storage tempStorage){
        storageDAO.save(tempStorage);
    }
    public void updateStorage(long id, Integer capacity, Integer quantity, float price){
        storageDAO.update(id, price, capacity, quantity);
    }

    public void updateSupplier(long id, Supplier supplier){
        storageDAO.updateSupplier(id, supplier);
    }

    public void updateStorageProducer(long id, StorageProducer storageProducer){
        storageDAO.updateStorageProducer(id, storageProducer);
    }

    public void updateSSD(long id, SSD ssd){
        storageDAO.updateSSD(id, ssd);
    }

    public void updateHDD(long id, HDD hdd){
        storageDAO.updateHDD(id, hdd);
    }




}
