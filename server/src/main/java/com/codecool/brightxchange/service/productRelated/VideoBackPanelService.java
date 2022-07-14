package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.repositories.productRelated.VideoBackPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("VideoBackPanelService")
public class VideoBackPanelService {
    @Autowired
    private VideoBackPanelDAO videoBackPanelDAO;
}
