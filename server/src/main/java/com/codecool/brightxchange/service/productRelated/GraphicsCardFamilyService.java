package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.GraphicsCardFamilyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GraphicsCardFamilyService")
public class GraphicsCardFamilyService{
    @Autowired
    private GraphicsCardFamilyDAO graphicsCardFamilyDAO;
}
