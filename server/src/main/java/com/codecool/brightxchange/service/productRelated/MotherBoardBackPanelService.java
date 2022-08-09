package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.MotherBoardBackPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("MotherBoardBackPanelService")
public class MotherBoardBackPanelService{
    private final MotherBoardBackPanelDAO motherBoardBackPanelDAO;

    public MotherBoardBackPanelService(MotherBoardBackPanelDAO motherBoardBackPanelDAO) {
        this.motherBoardBackPanelDAO = motherBoardBackPanelDAO;
    }
}
