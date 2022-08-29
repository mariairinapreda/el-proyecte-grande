package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.codecool.brightxchange.repositories.types.PowerSupplyTypeDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("PowerSupplyTypeService")
public class PowerSupplyTypeService {
    private final PowerSupplyTypeDAO powerSupplyTypeDAO;


    public PowerSupplyTypeService(PowerSupplyTypeDAO powerSupplyTypeDAO) {
        this.powerSupplyTypeDAO = powerSupplyTypeDAO;
    }

    public List<PowerSupplyType> getAll(){
        return powerSupplyTypeDAO.findAll();
    }
    public Optional<PowerSupplyType> getById(long id){
      return powerSupplyTypeDAO.findById(id);
    }

    public void addPowerSupplyType(PowerSupplyType powerSupplyType){
        powerSupplyTypeDAO.save(powerSupplyType);
    }

    public void updatePowerSupplyType(long id, PowerSupplyType powerSupplyType){
        powerSupplyTypeDAO.update(id, powerSupplyType.getName());
    }

}
