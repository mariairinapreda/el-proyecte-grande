package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.model.productRelated.*;
import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
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
    }
    public void updateGraphicsCardModel(long id, GCModel gcModel){
        graphicsCardDAO.updateModel(id, gcModel);
    }
    public void updateGraphicsMemoryType(long id, GraphicsCardMemoryType graphicsCardMemoryType){
        graphicsCardDAO.updateGraphicsCardMemoryType(id, graphicsCardMemoryType);
    }
    public void updateCardFamily(long id, GraphicsCardFamily graphicsCardFamily){
        graphicsCardDAO.updateGraphicsCardFamily(id, graphicsCardFamily);
    }
    public void updateGcSeries(long id, GCSeries gcSeries){
        graphicsCardDAO.updateSeries(id, gcSeries);
    }
    public void updateGraphicsCardProducer(long id, GraphicsCardProducer graphicsCardProducer){
        graphicsCardDAO.updateProducer(id, graphicsCardProducer);
    }
    public void updateGraphicsCardSupplier(long id, Supplier supplier){
        graphicsCardDAO.updateSupplier(id, supplier);
    }
    public void updateGCConnectionInterFace(long id, GCConnectionInterface connectionInterface){
        graphicsCardDAO.updateConnectionInterface(id, connectionInterface);
    }

    public void updateGcVideoBackPanel(long id, VideoBackPanel videoBackPanel){
        graphicsCardDAO.updateVideoBackPanel(id, videoBackPanel);
    }



}
