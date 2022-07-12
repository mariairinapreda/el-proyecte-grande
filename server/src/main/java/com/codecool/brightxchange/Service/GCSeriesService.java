package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.GCSeriesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("GCSeriesService")
public class GCSeriesService {
    @Autowired
    @Qualifier("GCSeriesMemory")
    private GCSeriesDAO gcSeriesDAO;
}
