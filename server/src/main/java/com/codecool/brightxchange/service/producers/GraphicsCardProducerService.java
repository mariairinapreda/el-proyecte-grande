package com.codecool.brightxchange.service.producers;

import com.codecool.brightxchange.repositories.producers.GraphicsCardProducerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("GraphicsCardProducerService")
public class GraphicsCardProducerService{
    private final GraphicsCardProducerDAO graphicsCardProducerDAO;

    public GraphicsCardProducerService(GraphicsCardProducerDAO graphicsCardProducerDAO) {
        this.graphicsCardProducerDAO = graphicsCardProducerDAO;
    }
}
