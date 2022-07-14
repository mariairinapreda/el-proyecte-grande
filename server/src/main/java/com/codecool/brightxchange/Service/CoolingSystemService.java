package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.CoolingSystemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("CoolingSystemService")
public class CoolingSystemService {
    @Autowired
    private CoolingSystemDAO coolingSystemDAO;
}
