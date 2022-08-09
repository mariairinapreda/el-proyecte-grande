package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.products.Case;
import com.codecool.brightxchange.repositories.products.CaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CaseService")
public class CaseService{
    private final CaseDAO caseDAO;

    public CaseService(CaseDAO caseDAO) {
        this.caseDAO = caseDAO;
    }

    public void addCase(Case tempCase){
        caseDAO.save(tempCase);
    }
}
