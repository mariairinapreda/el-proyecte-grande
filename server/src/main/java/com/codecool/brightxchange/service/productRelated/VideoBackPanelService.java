package com.codecool.brightxchange.service.productRelated;

import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.repositories.productRelated.VideoBackPanelDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service("VideoBackPanelService")
public class VideoBackPanelService {
    private final VideoBackPanelDAO videoBackPanelDAO;

    public VideoBackPanelService(VideoBackPanelDAO videoBackPanelDAO) {
        this.videoBackPanelDAO = videoBackPanelDAO;
    }

    public void saveVideoBackPanel(VideoBackPanel videoBackPanel){
        videoBackPanelDAO.save(videoBackPanel);
    }
    public List<VideoBackPanel> getAll(){
        return videoBackPanelDAO.findAll();

    }
    public Optional<VideoBackPanel> getById(long id){
        return videoBackPanelDAO.findById(id);
    }
    public void updateVideoBackPanel(long id, VideoBackPanel videoBackPanel){
        videoBackPanelDAO.update(id, videoBackPanel.getNumberOfDisplayPort(),
                videoBackPanel.getNumberOfDVI(),
                videoBackPanel.getNumberOfHDMI(),
                videoBackPanel.getNumberOfJack(),
                videoBackPanel.getNumberOfVGA());
    }


}
