package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.HddDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HddService")
public class HddService {
    private final HddDAO hddDAO;

    public HddService(HddDAO hddDAO) {
        this.hddDAO = hddDAO;
    }
}
