package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.CoolerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CoolerService")
public class CoolerService {
    private final CoolerDAO coolerDAO;

    public CoolerService(CoolerDAO coolerDAO) {
        this.coolerDAO = coolerDAO;
    }
}
