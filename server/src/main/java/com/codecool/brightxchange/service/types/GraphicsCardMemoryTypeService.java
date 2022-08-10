package com.codecool.brightxchange.service.types;

import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import com.codecool.brightxchange.repositories.types.GraphicsCardMemoryTypeDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GraphicsCardMemoryTypeService")
public class GraphicsCardMemoryTypeService {
    private final GraphicsCardMemoryTypeDAO graphicsCardMemoryTypeDAO;

    public GraphicsCardMemoryTypeService(GraphicsCardMemoryTypeDAO graphicsCardMemoryTypeDAO) {
        this.graphicsCardMemoryTypeDAO = graphicsCardMemoryTypeDAO;}

    public void addGCMemoryType(GraphicsCardMemoryType graphicsType){
        graphicsCardMemoryTypeDAO.save(graphicsType);
    }

    public List<GraphicsCardMemoryType> getAll(){
        return graphicsCardMemoryTypeDAO.findAll();
    }
    public Optional<GraphicsCardMemoryType> getById(long id){
        return graphicsCardMemoryTypeDAO.findById(id);
    }

    public void updateGraphicsCardMemoryType(long id, GraphicsCardMemoryType graphicsCardMemoryType){
        graphicsCardMemoryTypeDAO.update(id, graphicsCardMemoryType.getName());
    }



}
