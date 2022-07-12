package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.CaseDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("CaseService")
public class CaseService implements CaseDAO {
    @Autowired
    @Qualifier("CaseMemory")
    private CaseDAO caseDAO;
}
