package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.RAMProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("RAMProducerService")
public class RAMProducerService {
    @Autowired
    @Qualifier("RAMProducerMemory")
    private RAMProducerDAO ramProducerDAO;
}
