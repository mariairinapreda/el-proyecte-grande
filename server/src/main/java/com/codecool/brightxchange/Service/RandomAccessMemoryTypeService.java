package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.RandomAccessMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("RandomAccessMemoryTypeService")
public class RandomAccessMemoryTypeService {
    @Autowired
    private RandomAccessMemoryTypeDAO randomAccessMemoryTypeDAO;
}
