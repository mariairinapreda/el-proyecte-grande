package com.codecool.brightxchange.service.products;

import com.codecool.brightxchange.model.products.Desktop;
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
        desktopDAO.updateProcessor(id, desktop.getProcessor());
        desktopDAO.updateBackPanel(id, desktop.getBackPanel());
        desktopDAO.updateConnectivity(id, desktop.getConnectivity());
        desktopDAO.updateCoolingSystem(id, desktop.getCoolingSystem());
        desktopDAO.updateMemory(id, desktop.getMemory());
        desktopDAO.updateFrontPanel(id, desktop.getFrontPanel());
        desktopDAO.updateGraphicsCard(id, desktop.getGraphicsCard());
        desktopDAO.updateStorage(id, desktop.getStorage());
        desktopDAO.updateSupplier(id, desktop.getSupplier());
        desktopDAO.updateCase(id, desktop.getDesktopCase());
        desktopDAO.updateMotherBoard(id, desktop.getMotherboard());
        desktopDAO.updatePowerSupply(id, desktop.getPowerSupply());





    }

}
