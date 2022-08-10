package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.repositories.producers.GraphicsCardProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GraphicsCardProducerService")
public class GraphicsCardProducerService{
    private final GraphicsCardProducerDAO graphicsCardProducerDAO;

    public GraphicsCardProducerService(GraphicsCardProducerDAO graphicsCardProducerDAO) {
        this.graphicsCardProducerDAO = graphicsCardProducerDAO;

    }
    public void saveGraphicsCardProducer(GraphicsCardProducer graphicsCardProducer){
        graphicsCardProducerDAO.save(graphicsCardProducer);
    }
    public List<GraphicsCardProducer> getAll(){
        return graphicsCardProducerDAO.findAll();
    }

    public Optional<GraphicsCardProducer> getById(long id){
        return graphicsCardProducerDAO.findById(id);
    }
    public void updateGraphicsCardProducer(long id, GraphicsCardProducer graphicsCardProducer){
        graphicsCardProducerDAO.update(id, graphicsCardProducer.getName());
    }


}
