package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.repositories.types.GraphicsCardMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GraphicsCardMemoryTypeService")
public class GraphicsCardMemoryTypeService {
    private final GraphicsCardMemoryTypeDAO graphicsCardMemoryTypeDAO;

    public GraphicsCardMemoryTypeService(GraphicsCardMemoryTypeDAO graphicsCardMemoryTypeDAO) {
        this.graphicsCardMemoryTypeDAO = graphicsCardMemoryTypeDAO;
    }
}
