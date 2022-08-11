package com.codecool.brightxchange.controller.desktopController;


import com.codecool.brightxchange.model.productRelated.FrontPanel;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/front-panel")
public class FrontPanelController {

    @GetMapping
    public List<FrontPanel> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public FrontPanel getById(@PathVariable("id") Long id){
        return null;
    }

}
