package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.ChipsetProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ChipsetProducerService")
public class ChipsetProducerService {
    private final ChipsetProducerDAO chipsetProducerDAO;

    public ChipsetProducerService(ChipsetProducerDAO chipsetProducerDAO) {
        this.chipsetProducerDAO = chipsetProducerDAO;
    }
}
