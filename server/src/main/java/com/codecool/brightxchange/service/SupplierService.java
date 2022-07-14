package com.codecool.brightxchange.service;

import com.codecool.brightxchange.repositories.SupplierDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("SupplierService")
public class SupplierService {

    @Autowired
    private SupplierDAO supplierDAO;
}
