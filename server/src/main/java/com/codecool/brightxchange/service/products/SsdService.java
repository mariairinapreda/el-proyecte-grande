package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.SsdDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SsdService")
public class SsdService {

    @Autowired
    private SsdDAO ssdDAO;
}
