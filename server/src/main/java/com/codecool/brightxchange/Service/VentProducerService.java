package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.VentProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("VentProducerService")
public class VentProducerService {
    @Autowired
    private VentProducerDAO ventProducerDAO;

}
