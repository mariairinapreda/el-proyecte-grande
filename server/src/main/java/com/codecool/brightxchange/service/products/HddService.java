package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.products.HDD;
import com.codecool.brightxchange.repositories.products.HddDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("HddService")
public class HddService {
    private final HddDAO hddDAO;

    public HddService(HddDAO hddDAO) {
        this.hddDAO = hddDAO;
    }

    public void saveHDD(HDD hdd){
        hddDAO.save(hdd);
    }
    public List<HDD> getAll(){
        return hddDAO.findAll();
    }

    public Optional<HDD> getHDDBYid(long id){
        return hddDAO.findById(id);
    }

    public void updateHdd(long id, HDD hdd){
        hddDAO.update(id, hdd.getQuantity(),
                hdd.getPrice(),
                hdd.getCurrency(),
                hdd.getConnectionInterface(),
                hdd.getRotationSpeed());
        hddDAO.updateSupplier(id, hdd.getSupplier());
    }


}
