package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.MotherboardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("MotherboardService")
public class MotherboardService {
    @Autowired
    @Qualifier("MotherboardMemory")
    private MotherboardDAO motherboardDAO;
}
