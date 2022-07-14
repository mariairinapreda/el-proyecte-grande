package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.PowerSupplyProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PowerSupplyProducerService")
public class PowerSupplyProducerService {
    @Autowired
    private PowerSupplyProducerDAO powerSupplyProducerDAO;
}
