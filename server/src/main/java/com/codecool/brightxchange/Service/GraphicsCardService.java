package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.GraphicsCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service("GraphicsCardService")
public class GraphicsCardService{
    @Autowired
    @Qualifier("GraphicsCardMemory")
    private GraphicsCardDAO graphicsCardDAO;
}
