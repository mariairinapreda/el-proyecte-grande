package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.CaseProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CaseProducerService")
public class CaseProducerService{



    private final CaseProducerDAO caseProducerDAO;

    public CaseProducerService(CaseProducerDAO caseProducerDAO) {
        this.caseProducerDAO = caseProducerDAO;
    }
}
