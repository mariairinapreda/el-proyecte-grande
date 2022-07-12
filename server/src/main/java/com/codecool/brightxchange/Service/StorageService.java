package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.StorageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("StorageService")
public class StorageService {

    @Autowired
    @Qualifier("StorageMemory")
    private StorageDAO storageDAO;
}
