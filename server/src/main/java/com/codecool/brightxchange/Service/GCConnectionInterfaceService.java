package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.GCConnectionInterfaceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("GCConnectionInterfaceService")
public class GCConnectionInterfaceService  {
    @Autowired
    @Qualifier("GCConnectionInterfaceMemory")
    private GCConnectionInterfaceDAO gcConnectionInterfaceDAO;
}
