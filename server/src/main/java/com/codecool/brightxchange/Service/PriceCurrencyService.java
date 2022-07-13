package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.PriceCurrencyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("PriceCurrencyService")
public class PriceCurrencyService {
    @Autowired
    @Qualifier("PriceCurrencyMemory")
    private PriceCurrencyDAO priceCurrencyDAO;
}
