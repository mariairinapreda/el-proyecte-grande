package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.LaptopProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


@Service("LaptopProducerService")
public class LaptopProducerService{
    @Autowired
    @Qualifier("LaptopProducerMemory")
    private LaptopProducerDAO laptopProducerDAO;
}
