package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.Monitor;
import com.codecool.brightxchange.repositories.products.MonitorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("MonitorService")
public class MonitorService {
    private final MonitorDAO monitorDAO;

    public MonitorService(MonitorDAO monitorDAO) {
        this.monitorDAO = monitorDAO;
    }

    public List<Monitor> getAll(){
        return monitorDAO.findAll();
    }

    public Optional<Monitor> getById(long id){
        return monitorDAO.findById(id);
    }

    public void addMonitor(Monitor tempMonitor){
        monitorDAO.save(tempMonitor);
    }

    public void updateMonitor(long id,
                              float price,
                              Integer quantity,
                              Integer power,
                              Integer diagonal,
                              String dimensions,
                              Integer refreshRate,
                              Integer responseTime,
                              Integer weight){
        monitorDAO.update(id,
                price,
                quantity,
                power,
                diagonal,
                dimensions,
                refreshRate,
                responseTime,
                weight);
    }


    public void updateMonitorProducer(long id, MonitorProducer monitorProducer){
        monitorDAO.updateProducer(id, monitorProducer);
    }

    public  void updateVideoBackPanel(long id, VideoBackPanel backPanel){
        monitorDAO.updateVideoBackPanel(id, backPanel);
    }

    public void updateSupplier(long id, Supplier supplier){
        monitorDAO.updateSupplier(id, supplier);
    }


}
