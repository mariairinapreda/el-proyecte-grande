package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.CoolerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("CoolerService")
public class CoolerService {
    @Autowired
    @Qualifier("CoolerMemory")
    private CoolerDAO coolerDAO;

}
