package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.repositories.types.GraphicsCardMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GraphicsCardMemoryTypeService")
public class GraphicsCardMemoryTypeService {
    @Autowired
    private GraphicsCardMemoryTypeDAO graphicsCardMemoryTypeDAO;
}
