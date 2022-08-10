package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.repositories.producers.PowerSupplyProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PowerSupplyProducerService")
public class PowerSupplyProducerService {
    private final PowerSupplyProducerDAO powerSupplyProducerDAO;

    public PowerSupplyProducerService(PowerSupplyProducerDAO powerSupplyProducerDAO) {
        this.powerSupplyProducerDAO = powerSupplyProducerDAO;
    }

    public List<PowerSupplyProducer> getAll(){
        return powerSupplyProducerDAO.findAll();
    }

    public Optional<PowerSupplyProducer> getById(long id){
        return powerSupplyProducerDAO.findById(id);
    }

    public void addPowerSupplyProducer(PowerSupplyProducer tempPowerSupplyProducer){
        powerSupplyProducerDAO.save(tempPowerSupplyProducer);
    }

    public void updatePowerSupplyProducer(long id, String name){
        powerSupplyProducerDAO.update(id, name);
    }
}
