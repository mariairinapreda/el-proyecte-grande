package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.CoolingSystemDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CoolingSystemService")
public class CoolingSystemService {
    private final CoolingSystemDAO coolingSystemDAO;

    public CoolingSystemService(CoolingSystemDAO coolingSystemDAO) {
        this.coolingSystemDAO = coolingSystemDAO;
    }
}
