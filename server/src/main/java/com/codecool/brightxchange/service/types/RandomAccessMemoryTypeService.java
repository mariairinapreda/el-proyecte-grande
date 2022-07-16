package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.repositories.types.RandomAccessMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RandomAccessMemoryTypeService")
public class RandomAccessMemoryTypeService {
    private final RandomAccessMemoryTypeDAO randomAccessMemoryTypeDAO;

    public RandomAccessMemoryTypeService(RandomAccessMemoryTypeDAO randomAccessMemoryTypeDAO) {
        this.randomAccessMemoryTypeDAO = randomAccessMemoryTypeDAO;
    }
}
