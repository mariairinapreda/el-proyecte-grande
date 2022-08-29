package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.codecool.brightxchange.repositories.productRelated.MotherBoardBackPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("MotherBoardBackPanelService")
public class MotherBoardBackPanelService{
    private final MotherBoardBackPanelDAO motherBoardBackPanelDAO;

    public MotherBoardBackPanelService(MotherBoardBackPanelDAO motherBoardBackPanelDAO) {
        this.motherBoardBackPanelDAO = motherBoardBackPanelDAO;
    }

    public void saveMotherBoardBackPanel(MotherBoardBackPanel motherBoardBackPanel){
        motherBoardBackPanelDAO.save(motherBoardBackPanel);
    }

    public List<MotherBoardBackPanel> getAll(){
        return motherBoardBackPanelDAO.findAll();
    }

    public Optional<MotherBoardBackPanel> getById(long id){
        return motherBoardBackPanelDAO.findById(id);
    }

    public void updateMotherBoardBackPanel(long id, MotherBoardBackPanel motherBoardBackPanel){
        motherBoardBackPanelDAO.update(id, motherBoardBackPanel.getNumberOfDisplayPort(),
                motherBoardBackPanel.getNumberOfHDMI(),
                motherBoardBackPanel.getNumberOfRJ45(),
                motherBoardBackPanel.getNumberOfUSB2(),
                motherBoardBackPanel.getNumberOfUSB3_1_A(),
                motherBoardBackPanel.getNumberOfUSB3_2_A(),
                motherBoardBackPanel.getNumberOfUSB3_2_B());
    }

}
