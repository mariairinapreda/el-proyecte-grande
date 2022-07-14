package com.codecool.brightxchange.service;

import com.codecool.brightxchange.repositories.PriceCurrencyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("PriceCurrencyService")
public class PriceCurrencyService {
    @Autowired
    private PriceCurrencyDAO priceCurrencyDAO;
}
