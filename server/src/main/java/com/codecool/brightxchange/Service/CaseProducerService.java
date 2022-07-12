package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.CaseProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("CaseProducerService")
public class CaseProducerService implements CaseProducerDAO {
    @Autowired
    @Qualifier("CaseProducerMemory")
    private CaseProducerDAO caseProducerDAO;
}
