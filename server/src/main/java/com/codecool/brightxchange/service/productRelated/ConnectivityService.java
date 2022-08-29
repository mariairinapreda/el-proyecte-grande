package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.repositories.productRelated.ConnectivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("ConnectivityService")
public class ConnectivityService {
    private final ConnectivityDAO connectivityDAO;

    public ConnectivityService(ConnectivityDAO connectivityDAO) {
        this.connectivityDAO = connectivityDAO;
    }

    public void addConnectivity(Connectivity connectivity){
        connectivityDAO.save(connectivity);
    }
    public List<Connectivity> getAll(){
        return connectivityDAO.findAll();
    }

    public Optional<Connectivity> getById(long id){
        return connectivityDAO.findById(id);
    }

    public void updateConnectivity(long id, Connectivity connectivity){
        connectivityDAO.update(id, connectivity.getType());
    }

}
