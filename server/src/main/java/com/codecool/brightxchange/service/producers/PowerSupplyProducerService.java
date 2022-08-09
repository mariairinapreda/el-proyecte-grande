package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.PowerSupplyProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PowerSupplyProducerService")
public class PowerSupplyProducerService {
    private final PowerSupplyProducerDAO powerSupplyProducerDAO;

    public PowerSupplyProducerService(PowerSupplyProducerDAO powerSupplyProducerDAO) {
        this.powerSupplyProducerDAO = powerSupplyProducerDAO;
    }
}
