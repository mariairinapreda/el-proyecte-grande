package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.GraphicsCardFamilyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GraphicsCardFamilyService")
public class GraphicsCardFamilyService{
    private final GraphicsCardFamilyDAO graphicsCardFamilyDAO;

    public GraphicsCardFamilyService(GraphicsCardFamilyDAO graphicsCardFamilyDAO) {
        this.graphicsCardFamilyDAO = graphicsCardFamilyDAO;
    }
}
