package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.products.GraphicsCard;
import com.codecool.brightxchange.repositories.products.GraphicsCardDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("GraphicsCardService")
public class GraphicsCardService{
    private final GraphicsCardDAO graphicsCardDAO;

    public GraphicsCardService(GraphicsCardDAO graphicsCardDAO) {
        this.graphicsCardDAO = graphicsCardDAO;
    }

    public void saveGraphicsCard(GraphicsCard graphicsCard){
        graphicsCardDAO.save(graphicsCard);
    }

    public List<GraphicsCard> getAll(){
        return graphicsCardDAO.findAll();
    }

    public Optional<GraphicsCard> getGraphicsCardById(long id){
        return graphicsCardDAO.findById(id);
    }

    public void updateGraphicsCard(long id, GraphicsCard graphicsCard){
        graphicsCardDAO.update(id, graphicsCard.getCurrency(),
                graphicsCard.getPrice(),
                graphicsCard.getQuantity(),
                graphicsCard.getBusMemory(),
                graphicsCard.getQuantity(),
                graphicsCard.getResolution(),
                graphicsCard.getVideoMemory(),
                graphicsCard.getOther());
        graphicsCardDAO.updateModel(id, graphicsCard.getModel());
        graphicsCardDAO.updateGraphicsCardMemoryType(id, graphicsCard.getMemoryType());
        graphicsCardDAO.updateGraphicsCardFamily(id, graphicsCard.getFamily());
        graphicsCardDAO.updateSeries(id, graphicsCard.getGcSeries());
        graphicsCardDAO.updateProducer(id, graphicsCard.getProducer());
        graphicsCardDAO.updateSupplier(id, graphicsCard.getSupplier());
        graphicsCardDAO.updateConnectionInterface(id, graphicsCard.getGcConnectionInterface());
        graphicsCardDAO.updateVideoBackPanel(id, graphicsCard.getBackPanel());

    }




}
