package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.CoolerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("CoolerService")
public class CoolerService {
    @Autowired
    private CoolerDAO coolerDAO;

}
