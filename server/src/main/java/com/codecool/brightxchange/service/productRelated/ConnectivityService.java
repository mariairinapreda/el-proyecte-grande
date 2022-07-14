package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.ConnectivityDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("ConnectivityService")
public class ConnectivityService {
    @Autowired
    private ConnectivityDAO connectivityDAO;
}
