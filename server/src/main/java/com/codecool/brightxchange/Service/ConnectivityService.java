package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.ConnectivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("ConnectivityService")
public class ConnectivityService implements ConnectivityDAO {
    @Autowired
    @Qualifier("ConnectivityMemory")
    private ConnectivityDAO connectivityDAO;
}
