package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.ConnectivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ConnectivityService")
public class ConnectivityService {
    private final ConnectivityDAO connectivityDAO;

    public ConnectivityService(ConnectivityDAO connectivityDAO) {
        this.connectivityDAO = connectivityDAO;
    }
}
