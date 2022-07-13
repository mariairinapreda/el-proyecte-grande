package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.MonitorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("MonitorService")
public class MonitorService {
    @Autowired
    @Qualifier("MonitorMemory")
    private MonitorDAO monitorDAO;

}
