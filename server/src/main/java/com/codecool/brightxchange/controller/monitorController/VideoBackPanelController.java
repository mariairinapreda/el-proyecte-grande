package com.codecool.brightxchange.controller.monitorController;

import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.service.productRelated.VideoBackPanelService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/video-back-panel")
public class VideoBackPanelController {
    private final VideoBackPanelService service;

    public VideoBackPanelController(VideoBackPanelService service) {
        this.service = service;
    }

    @GetMapping
    public List<VideoBackPanel> getAll(){
        return service.getAll();
    }

    @GetMapping("{id}")
    public VideoBackPanel getById(@PathVariable("id") Long id){
        return service.getById(id).get();
    }
    @PostMapping
    public void addVideoBackPanel(@RequestBody VideoBackPanel videoBackPanel){
        service.saveVideoBackPanel(videoBackPanel);
    }

    @PutMapping("{id}")
    public void update(@PathVariable("id") long id, @RequestBody VideoBackPanel videoBackPanel){
        service.updateVideoBackPanel(id, videoBackPanel);
    }
}
