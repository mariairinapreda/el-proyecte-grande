package com.codecool.brightxchange.service.producers;
import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.repositories.producers.MonitorProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("MonitorProducerService")
public class MonitorProducerService {
    private final MonitorProducerDAO monitorProducerDAO;

    public MonitorProducerService(MonitorProducerDAO monitorProducerDAO) {
        this.monitorProducerDAO = monitorProducerDAO;
    }

    public List<MonitorProducer> getAll(){
        return monitorProducerDAO.findAll();
    }

    public Optional<MonitorProducer> getById(long id){
        return monitorProducerDAO.findById(id);
    }

    public void addMonitorProducer(MonitorProducer tempMonitorProducer){
        monitorProducerDAO.save(tempMonitorProducer);
    }

    public void updateMonitorProducer(long id, String name){
        monitorProducerDAO.update(id, name);
    }
}
