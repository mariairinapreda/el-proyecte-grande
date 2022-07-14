package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.StorageProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("StorageProducerService")
public class StorageProducerService {
    @Autowired
    private StorageProducerDAO storageProducerDAO;
}
