package com.codecool.brightxchange.Service;

import com.codecool.brightxchange.Service.modelDAO.DAO.GraphicsCardMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("GraphicsCardMemoryTypeService")
public class GraphicsCardMemoryTypeService {
    @Autowired
    @Qualifier("GraphicsCardMemoryTypeMemory")
    private GraphicsCardMemoryTypeDAO graphicsCardMemoryTypeDAO;
}
