package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.GCConnectionInterface;
import com.codecool.brightxchange.repositories.productRelated.GCConnectionInterfaceDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GCConnectionInterfaceService")
public class GCConnectionInterfaceService  {
    private final GCConnectionInterfaceDAO gcConnectionInterfaceDAO;

    public GCConnectionInterfaceService(GCConnectionInterfaceDAO gcConnectionInterfaceDAO) {
        this.gcConnectionInterfaceDAO = gcConnectionInterfaceDAO;
    }

    public void addConnectionInterface(GCConnectionInterface gcConnectionInterface){
        gcConnectionInterfaceDAO.save(gcConnectionInterface);
    }
    public List<GCConnectionInterface> getAll(){
        return gcConnectionInterfaceDAO.findAll();
    }

    public Optional<GCConnectionInterface> getById(long id){
        return gcConnectionInterfaceDAO.findById(id);
    }

    public void updateConnectionInterface(long id, GCConnectionInterface gcConnectionInterface){
        gcConnectionInterfaceDAO.update(id, gcConnectionInterface.getName());
    }

}
