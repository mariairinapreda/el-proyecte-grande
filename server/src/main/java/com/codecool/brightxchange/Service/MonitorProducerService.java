package com.codecool.brightxchange.Service;
import com.codecool.brightxchange.Service.modelDAO.DAO.MonitorProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("MonitorProducerService")
public class MonitorProducerService {
    @Autowired
    private MonitorProducerDAO monitorProducerDAO;
}
