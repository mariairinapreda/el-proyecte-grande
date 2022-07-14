package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.GCConnectionInterfaceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GCConnectionInterfaceService")
public class GCConnectionInterfaceService  {
    @Autowired
    private GCConnectionInterfaceDAO gcConnectionInterfaceDAO;
}
