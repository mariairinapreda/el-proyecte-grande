package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.producers.VentProducer;
import com.codecool.brightxchange.repositories.producers.VentProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("VentProducerService")
public class VentProducerService {
    private final VentProducerDAO ventProducerDAO;

    public VentProducerService(VentProducerDAO ventProducerDAO) {
        this.ventProducerDAO = ventProducerDAO;
    }
    public List<VentProducer> getAll(){
        return ventProducerDAO.findAll();
    }

    public Optional<VentProducer> getById(long id){
        return ventProducerDAO.findById(id);
    }

    public void addVentProducer(VentProducer tempVentProducer){
        ventProducerDAO.save(tempVentProducer);
    }

    public void updateVentProducer(long id, String name){
        ventProducerDAO.update(id, name);
    }
}
