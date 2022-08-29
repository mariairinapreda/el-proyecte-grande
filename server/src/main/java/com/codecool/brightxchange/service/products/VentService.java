package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.VentProducer;
import com.codecool.brightxchange.model.products.Vent;
import com.codecool.brightxchange.repositories.products.VentDAO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("VentService")
public class VentService {
    private final VentDAO ventDAO;


    public VentService(VentDAO ventDAO) {
        this.ventDAO = ventDAO;
    }

    public void addVent(Vent vent){
        ventDAO.save(vent);
    }

    public List<Vent> getAll(){
        return ventDAO.findAll();
    }
    public Optional<Vent> getById(long id){
        return ventDAO.findById(id);
    }

    public void updateVent(long id, Vent vent){
     ventDAO.update(id,
             vent.getRotationSpeed(),
             vent.getCurrency(),
             vent.getPrice(),
             vent.getQuantity(),
             vent.getDescription(),
             vent.getDimensions(),
             vent.getVentDimensions(),
             vent.getVentsNumber());
    }

    public void updateVentSupplier(long id, Supplier supplier){
        ventDAO.updateSupplier(id, supplier);
    }
    public void updateVentProducer(long id, VentProducer ventProducer){
        ventDAO.updateProducer(id, ventProducer);
    }
}
