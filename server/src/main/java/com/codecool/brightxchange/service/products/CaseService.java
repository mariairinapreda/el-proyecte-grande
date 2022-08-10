package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.products.Case;
import com.codecool.brightxchange.repositories.products.CaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("CaseService")
public class CaseService{
    private final CaseDAO caseDAO;

    public CaseService(CaseDAO caseDAO) {
        this.caseDAO = caseDAO;
    }

    public void addCase(Case tempCase){
        caseDAO.save(tempCase);
    }

public List<Case> getAll(){
       return caseDAO.findAll();
}
public Optional<Case> getCaseById(long id){
        return caseDAO.findById(id);
}
public void updateCase(long id,Case c){
        caseDAO.update(id,
                c.getCurrency(),
                c.getPrice(),
                c.getQuantity(),
                c.getModel(),
                c.getNumberOfHDD(),
                c.getNumberOfSSD());
        caseDAO.updateCaseType(id,c.getCaseType() );
        caseDAO.updateCaseProducer(id, c.getCaseProducer());
        caseDAO.updateSupplier(id, c.getSupplier());
}

}
