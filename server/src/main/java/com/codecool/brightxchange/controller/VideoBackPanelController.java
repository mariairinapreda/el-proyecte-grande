package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/video-back-panel")
public class VideoBackPanelController {

    @GetMapping
    public List<VideoBackPanel> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public VideoBackPanel getById(@PathVariable("id") Long id){
        return null;
    }
}
