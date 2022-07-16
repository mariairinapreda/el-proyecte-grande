package com.codecool.brightxchange.service.producers;
import com.codecool.brightxchange.repositories.producers.MonitorProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MonitorProducerService")
public class MonitorProducerService {
    private final MonitorProducerDAO monitorProducerDAO;

    public MonitorProducerService(MonitorProducerDAO monitorProducerDAO) {
        this.monitorProducerDAO = monitorProducerDAO;
    }
}
