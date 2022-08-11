package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.repositories.types.CaseTypeDAO;
import com.codecool.brightxchange.model.productTypes.CaseType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.*;

@Service("CaseTypeService")
public class CaseTypeService {
    private final CaseTypeDAO caseTypeDAO;

    public CaseTypeService(CaseTypeDAO caseTypeDAO) {
        this.caseTypeDAO = caseTypeDAO;
    }

    public List<CaseType> getAll(){
        return caseTypeDAO.findAll();
    }

    public Optional<CaseType> getById(Long id){
        return caseTypeDAO.findById(id);
    }

    public List<CaseType> getAllAfterId(Long id){
        return caseTypeDAO.findCaseTypesByIdAfter(id);
    }

    public void addCaseType(CaseType caseType){
        caseTypeDAO.save(caseType);
    }
    public void updateCaseType(long id, CaseType caseType){
        caseTypeDAO.update(id, caseType.getName());
    }
}
