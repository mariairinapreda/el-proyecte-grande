package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.*;
import com.codecool.brightxchange.repositories.products.LaptopDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("LaptopService")
public class LaptopService{
    private final LaptopDAO laptopDAO;

    public LaptopService(LaptopDAO laptopDAO) {
        this.laptopDAO = laptopDAO;
    }

    public List<Laptop> getAll(){
        return laptopDAO.findAll();
    }

    public Optional<Laptop> getById(long id){
        return laptopDAO.findById(id);
    }

    public void addLaptop(Laptop tempLaptop){
        laptopDAO.save(tempLaptop);
    }

    public void update(long id, float price, Integer weight, Integer quantity){
        laptopDAO.update(id, price, weight, quantity);
    }

    public void updateSupplier(long id, Supplier supplier){
        laptopDAO.updateSupplier(id, supplier);
    }

    public void updateVideoBackPanel(long id, VideoBackPanel videoBackPanel){
        laptopDAO.updateVideoBackPanel(id, videoBackPanel);
    }

    public void updateConnectivity(long id, Connectivity connectivity){
        laptopDAO.updateConnectivity(id, connectivity);
    }

    public void updateDisplay(long id, Display display){
        laptopDAO.updateDisplay(id, display);
    }

    public void updateGraphicsCard(long id, GraphicsCard graphicsCard){
        laptopDAO.updateGraphicsCard(id, graphicsCard);
    }

    public void updateLaptopProducer(long id, LaptopProducer laptopProducer){
        laptopDAO.updateLaptopProducer(id, laptopProducer);
    }

    public void updateMemory(long id, RandomAccessMemory memory){
        laptopDAO.updateMemory(id, memory);
    }

    public void updateProcessor(long id, Processor processor){
        laptopDAO.updateProcessor(id, processor);
    }

    public void updateStorage(long id, Storage storage){
        laptopDAO.updateStorage(id, storage);
    }

}
