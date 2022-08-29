package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
import com.codecool.brightxchange.repositories.types.RandomAccessMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("RandomAccessMemoryTypeService")
public class RandomAccessMemoryTypeService {
    private final RandomAccessMemoryTypeDAO randomAccessMemoryTypeDAO;

    public RandomAccessMemoryTypeService(RandomAccessMemoryTypeDAO randomAccessMemoryTypeDAO) {
        this.randomAccessMemoryTypeDAO = randomAccessMemoryTypeDAO;
    }

    public void addRamType(RandomAccessMemoryType randomAccessMemoryType){
        randomAccessMemoryTypeDAO.save(randomAccessMemoryType);
    }
    public List<RandomAccessMemoryType> getAll(){
        return randomAccessMemoryTypeDAO.findAll();
    }
    public Optional<RandomAccessMemoryType> getById(long id){
    return randomAccessMemoryTypeDAO.findById(id);
    }
    public void updateRam(long id, RandomAccessMemoryType randomAccessMemoryType){
        randomAccessMemoryTypeDAO.update(id,randomAccessMemoryType.getName());
    }
}
