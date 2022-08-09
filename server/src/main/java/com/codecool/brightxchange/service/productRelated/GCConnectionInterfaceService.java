package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.GCConnectionInterfaceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GCConnectionInterfaceService")
public class GCConnectionInterfaceService  {
    private final GCConnectionInterfaceDAO gcConnectionInterfaceDAO;

    public GCConnectionInterfaceService(GCConnectionInterfaceDAO gcConnectionInterfaceDAO) {
        this.gcConnectionInterfaceDAO = gcConnectionInterfaceDAO;
    }
}
