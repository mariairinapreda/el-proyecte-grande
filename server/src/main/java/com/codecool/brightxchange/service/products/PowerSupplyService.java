package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.codecool.brightxchange.model.products.PowerSupply;
import com.codecool.brightxchange.repositories.products.PowerSupplyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PowerSupplyService")
public class PowerSupplyService {
    private final PowerSupplyDAO powerSupplyDAO;

    public PowerSupplyService(PowerSupplyDAO powerSupplyDAO) {
        this.powerSupplyDAO = powerSupplyDAO;
    }

    public List<PowerSupply> getAll(){
       return powerSupplyDAO.findAll();
    }

    public Optional<PowerSupply> getById(long id){
        return powerSupplyDAO.findById(id);
    }

    public void addPowerSupply(PowerSupply tempPowerSupply){
        powerSupplyDAO.save(tempPowerSupply);
    }

    public void updatePowerSupply(long id,
                                  float price,
                                  Integer quantity,
                                  String certification,
                                  Integer power){
        powerSupplyDAO.update(id,
                price,
                quantity,
                certification,
                power);
    }

    public void updateSupplier(long id, Supplier supplier){
        powerSupplyDAO.updateSupplier(id, supplier);
    }

    public void updatePowerSupplyProducer(long id, PowerSupplyProducer powerSupplyProducer){
        powerSupplyDAO.updatePowerSupplyProducer(id, powerSupplyProducer);
    }

    public void updatePowerSupplyType(long id, PowerSupplyType powerSupplyType){
        powerSupplyDAO.updatePowerSupplyType(id, powerSupplyType);
    }





}
