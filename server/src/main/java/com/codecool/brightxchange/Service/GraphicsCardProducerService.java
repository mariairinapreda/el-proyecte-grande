package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.GraphicsCardProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("GraphicsCardProducerService")
public class GraphicsCardProducerService{
    @Autowired
    private GraphicsCardProducerDAO graphicsCardProducerDAO;
}
