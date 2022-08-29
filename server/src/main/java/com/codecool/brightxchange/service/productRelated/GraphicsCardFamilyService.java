package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.GraphicsCardFamily;
import com.codecool.brightxchange.repositories.productRelated.GraphicsCardFamilyDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GraphicsCardFamilyService")
public class GraphicsCardFamilyService{
    private final GraphicsCardFamilyDAO graphicsCardFamilyDAO;

    public GraphicsCardFamilyService(GraphicsCardFamilyDAO graphicsCardFamilyDAO) {
        this.graphicsCardFamilyDAO = graphicsCardFamilyDAO;
    }

    public void saveGraphicsCardFamily(GraphicsCardFamily graphicsCardFamily){
        graphicsCardFamilyDAO.save(graphicsCardFamily);
    }

    public List<GraphicsCardFamily> getAll(){
        return graphicsCardFamilyDAO.findAll();
    }

    public Optional<GraphicsCardFamily> getGraphicsCardFamilyById(long id){
        return graphicsCardFamilyDAO.findById(id);
    }


    public void updateGraphicCardFamily(long id, GraphicsCardFamily graphicsCardFamily){
        graphicsCardFamilyDAO.update(id, graphicsCardFamily.getName());
    }

}
