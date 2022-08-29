package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.repositories.producers.CaseProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CaseProducerService")
public class CaseProducerService{



    private final CaseProducerDAO caseProducerDAO;

    public CaseProducerService(CaseProducerDAO caseProducerDAO) {
        this.caseProducerDAO = caseProducerDAO;
    }

public void addCaseProducer(CaseProducer caseProducer){
        caseProducerDAO.save(caseProducer);
}

public List<CaseProducer> getAll(){
       return  caseProducerDAO.findAll();
    }

public Optional<CaseProducer> getCaseProducerById(long id){
        return caseProducerDAO.findById(id);
}

public void update(long id, CaseProducer caseProducer){
        caseProducerDAO.update(id, caseProducer.getName());

}




}
