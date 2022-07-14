package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.RAMProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("RAMProducerService")
public class RAMProducerService {
    @Autowired
    private RAMProducerDAO ramProducerDAO;
}
