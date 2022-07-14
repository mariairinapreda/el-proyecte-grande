package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.GCSeriesDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GCSeriesService")
public class GCSeriesService {
    @Autowired
    private GCSeriesDAO gcSeriesDAO;
}
