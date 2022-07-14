package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.products.Case;
import com.codecool.brightxchange.repositories.products.CaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CaseService")
public class CaseService{
    @Autowired
    private CaseDAO caseDAO;

    public void addCase(Case tempCase){
        caseDAO.save(tempCase);
    }
}
