package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.MotherboardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MotherboardService")
public class MotherboardService {
    @Autowired
    private MotherboardDAO motherboardDAO;
}
