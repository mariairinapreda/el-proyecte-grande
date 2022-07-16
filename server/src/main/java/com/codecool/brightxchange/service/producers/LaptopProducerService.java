package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.LaptopProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("LaptopProducerService")
public class LaptopProducerService{
    private final LaptopProducerDAO laptopProducerDAO;

    public LaptopProducerService(LaptopProducerDAO laptopProducerDAO) {
        this.laptopProducerDAO = laptopProducerDAO;
    }
}
