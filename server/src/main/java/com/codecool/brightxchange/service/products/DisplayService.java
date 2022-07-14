package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.repositories.products.DisplayDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("DisplayService")
public class DisplayService  {
    @Autowired
    private DisplayDAO displayDAO;
}
