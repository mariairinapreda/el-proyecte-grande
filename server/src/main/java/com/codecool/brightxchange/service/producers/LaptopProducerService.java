package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.LaptopProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service("LaptopProducerService")
public class LaptopProducerService{
    @Autowired
    private LaptopProducerDAO laptopProducerDAO;
}
