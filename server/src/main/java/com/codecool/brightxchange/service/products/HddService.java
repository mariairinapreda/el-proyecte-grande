package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.HddDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("HddService")
public class HddService {
    @Autowired
    private HddDAO hddDAO;
}
