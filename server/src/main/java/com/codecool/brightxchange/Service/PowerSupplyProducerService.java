package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.PowerSupplyProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("PowerSupplyProducerService")
public class PowerSupplyProducerService {
    @Autowired
    @Qualifier("PowerSupplyProducerMemory")
    private PowerSupplyProducerDAO powerSupplyProducerDAO;
}
