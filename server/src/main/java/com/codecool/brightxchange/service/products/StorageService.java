package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.StorageDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StorageService")
public class StorageService {

    @Autowired
    private StorageDAO storageDAO;
}
