package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.codecool.brightxchange.model.products.*;
import com.codecool.brightxchange.repositories.products.DesktopDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("DesktopService")
public class DesktopService {

    private final DesktopDAO desktopDAO;

    public DesktopService(DesktopDAO desktopDAO) {
        this.desktopDAO = desktopDAO;
    }

    public void addDesktop(Desktop desktop) {
        desktopDAO.save(desktop);
    }

    public List<Desktop> getAll() {
        return desktopDAO.findAll();
    }

    public Optional<Desktop> getDesktopById(long id) {
        return desktopDAO.findById(id);
    }

    public void updateDesktop(long id, Desktop desktop) {
        desktopDAO.update(id, desktop.getCurrency(), desktop.getPrice(), desktop.getQuantity());
    }
    public void updateDesktopProcessor(long id, Processor processor){
        desktopDAO.updateProcessor(id, processor);
    }
    public void updateDesktopBackPanel(long id, MotherBoardBackPanel motherBoardBackPanel){
        desktopDAO.updateBackPanel(id, motherBoardBackPanel);
    }
    public void updateDesktopConnectivity(long id, Connectivity connectivity){
        desktopDAO.updateConnectivity(id,connectivity);
    }
    public void updateDesktopCoolingSystem(long id, CoolingSystem coolingSystem){
        desktopDAO.updateCoolingSystem(id, coolingSystem);
    }
    public void updateDesktopMemory(long id, RandomAccessMemory randomAccessMemory){
        desktopDAO.updateMemory(id, randomAccessMemory);
    }
    public void updateDesktopFrontPanel(long id, FrontPanel frontPanel){
        desktopDAO.updateFrontPanel(id, frontPanel);
    }
    public void updateDesktopGraphicsCard(long id, GraphicsCard graphicsCard){
        desktopDAO.updateGraphicsCard(id, graphicsCard);
    }
    public void updateDesktopStorage(long id, Storage storage){
        desktopDAO.updateStorage(id, storage);
    }
    public void updateDesktopSupplier(long id, Supplier supplier){
        desktopDAO.updateSupplier(id, supplier);
    }
    public void updateDesktopCase(long id, Case case_){
        desktopDAO.updateCase(id, case_);
    }
    public void updateDesktopMotherBoard(long id, Motherboard motherboard){
        desktopDAO.updateMotherBoard(id,motherboard);
    }
    public void updateDesktopPowerSupply(long id, PowerSupply powerSupply){
        desktopDAO.updatePowerSupply(id, powerSupply);
    }

}
