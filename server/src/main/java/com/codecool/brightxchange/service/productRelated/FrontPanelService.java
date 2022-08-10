package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.repositories.productRelated.FrontPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("FrontPanelService")
public class FrontPanelService {
    private final FrontPanelDAO frontPanelDAO;

    public FrontPanelService(FrontPanelDAO frontPanelDAO) {
        this.frontPanelDAO = frontPanelDAO;
    }

    public void saveFrontPanel(FrontPanel frontPanel){
        frontPanelDAO.save(frontPanel);
    }
    public List<FrontPanel> getAll(){
        return frontPanelDAO.findAll();
    }

    public Optional<FrontPanel> GetById(long id){
        return frontPanelDAO.findById(id);
    }
    public void updateFrontPanel(long id, FrontPanel frontPanel){
        frontPanelDAO.update(id, frontPanel.getNumberOfHeadphonesJack(),
                frontPanel.getNumberOfMicrophoneJack(),
                frontPanel.getNumberOfUSB2(),
                frontPanel.getNumberOfUSB3());
    }

}
