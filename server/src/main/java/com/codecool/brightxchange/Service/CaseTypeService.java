package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.CaseTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("CaseTypeService")
public class CaseTypeService {
    @Autowired
    @Qualifier("CaseTypeMemory")
    private CaseTypeDAO caseTypeDAO;
}
