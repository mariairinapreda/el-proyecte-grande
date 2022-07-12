package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.GCModelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("GCModelService")
public class GCModelService{
    @Autowired
    @Qualifier("GCModelMemory")
    private GCModelDAO gcModelDAO;
}
