package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.PowerSupplyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("PowerSupplyService")
public class PowerSupplyService {
    @Autowired
    @Qualifier("PowerSupplyMemory")
    private PowerSupplyDAO powerSupplyDAO;
}
