package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.FrontPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("FrontPanelService")
public class FrontPanelService {
    @Autowired
    private FrontPanelDAO frontPanelDAO;
}
