package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.products.SSD;
import com.codecool.brightxchange.repositories.products.SsdDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("SsdService")
public class SsdService {

    private final SsdDAO ssdDAO;

    public SsdService(SsdDAO ssdDAO) {
        this.ssdDAO = ssdDAO;
    }

    public List<SSD> getAll(){
        return ssdDAO.findAll();
    }

    public Optional<SSD> getById(long id){
        return ssdDAO.findById(id);
    }

    public void addSSD(SSD tempSSD){
        ssdDAO.save(tempSSD);
    }

    public void updateSSD(long id, Integer quantity, Integer readSpeed, Integer writeSpeed, float price){
        ssdDAO.update(id, quantity, readSpeed, writeSpeed, price);
    }

    public void updateSupplier(long id, Supplier supplier){
        ssdDAO.updateSupplier(id, supplier);
    }


}
