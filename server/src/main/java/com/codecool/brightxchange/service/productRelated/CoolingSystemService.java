package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.repositories.productRelated.CoolingSystemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CoolingSystemService")
public class CoolingSystemService {
    private final CoolingSystemDAO coolingSystemDAO;

    public CoolingSystemService(CoolingSystemDAO coolingSystemDAO) {
        this.coolingSystemDAO = coolingSystemDAO;
    }

    public void addCoolingSystem(CoolingSystem coolingSystem){
        coolingSystemDAO.save(coolingSystem);

    }
    public List<CoolingSystem> getAll(){
        return coolingSystemDAO.findAll();
    }

    public Optional<CoolingSystem> getById(long id){
        return coolingSystemDAO.findById(id);
    }
    public void updateCoolingSystem(long id, CoolingSystem coolingSystem){
        coolingSystemDAO.update(id, coolingSystem.getType());
    }
}
