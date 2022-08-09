package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.VentProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("VentProducerService")
public class VentProducerService {
    private final VentProducerDAO ventProducerDAO;

    public VentProducerService(VentProducerDAO ventProducerDAO) {
        this.ventProducerDAO = ventProducerDAO;
    }
}
