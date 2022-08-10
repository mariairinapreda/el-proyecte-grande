package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import com.codecool.brightxchange.model.products.RandomAccessMemory;
import com.codecool.brightxchange.repositories.products.RandomAccessMemoryDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.lang.management.MemoryType;
import java.util.List;
import java.util.Optional;

@Service("RAMService")
public class RAMService {
    private final RandomAccessMemoryDAO randomAccessMemoryDAO;

    public RAMService(RandomAccessMemoryDAO randomAccessMemoryDAO) {
        this.randomAccessMemoryDAO = randomAccessMemoryDAO;
    }

    public List<RandomAccessMemory> getAll(){
        return randomAccessMemoryDAO.findAll();
    }

    public Optional<RandomAccessMemory> getById(long id){
        return randomAccessMemoryDAO.findById(id);
    }

    public void addRandomAccessMemory(RandomAccessMemory tempRAM){
        randomAccessMemoryDAO.save(tempRAM);
    }

    public void updateRandomAccessMemory(long id, Integer quantity, Integer capacity, float price){
        randomAccessMemoryDAO.update(id, quantity, capacity, price);
    }

    public void updateSupplier(long id, Supplier supplier){
        randomAccessMemoryDAO.updateSupplier(id, supplier);
    }

    public void updateMemoryType(long id, RandomAccessMemoryType memoryType){
        randomAccessMemoryDAO.updateMemoryType(id, memoryType);
    }

    public void updateRamProducer(long id, RAMProducer ramProducer){
        randomAccessMemoryDAO.updateRamProducer(id, ramProducer);
    }


}
