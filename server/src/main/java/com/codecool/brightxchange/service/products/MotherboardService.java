package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.codecool.brightxchange.model.products.GraphicsCard;
import com.codecool.brightxchange.model.products.Motherboard;
import com.codecool.brightxchange.repositories.products.MotherboardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("MotherboardService")
public class MotherboardService {
    private final MotherboardDAO motherboardDAO;

    public MotherboardService(MotherboardDAO motherboardDAO) {
        this.motherboardDAO = motherboardDAO;
    }

    public List<Motherboard> getAll(){
        return motherboardDAO.findAll();
    }

    public Optional<Motherboard> getById(long id){
        return motherboardDAO.findById(id);
    }

    public void addMotherboard(Motherboard tempMotherboard){
        motherboardDAO.save(tempMotherboard);
    }

    public void updateMotherboard(long id,
                                  float price,
                                  Integer quantity,
                                  String chipset,
                                  Integer numberOfM2,
                                  Integer numberOfSATA3){
        motherboardDAO.update(id,
                price,
                quantity,
                chipset,
                numberOfM2,
                numberOfSATA3
        );

    }
    public void updateSupplier(long id, Supplier supplier){
        motherboardDAO.updateSupplier(id, supplier);
    }

    public void updateMotherboardProducer(long id, MotherboardProducer motherboardProducer){
        motherboardDAO.updateMotherboardProducer(id, motherboardProducer);
    }

    public void updateChipsetProducer(long id, ChipsetProducer chipsetProducer){
        motherboardDAO.updateChipsetProducer(id, chipsetProducer);
    }


}
