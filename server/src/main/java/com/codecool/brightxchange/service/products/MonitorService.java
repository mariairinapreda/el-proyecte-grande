package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.MonitorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MonitorService")
public class MonitorService {
    @Autowired
    private MonitorDAO monitorDAO;

}
