package com.codecool.brightxchange.controller.desktopController;


import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.service.productRelated.ConnectivityService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/connectivity")
public class ConnectivityController {

    private ConnectivityService connectivityService;

    public ConnectivityController(ConnectivityService connectivityService) {
        this.connectivityService = connectivityService;
    }

    @GetMapping
    public List<Connectivity> getAll(){
        return connectivityService.getAll();
    }

    @GetMapping("{id}")
    public Connectivity getById(@PathVariable("id") Long id){
        return connectivityService.getById(id).orElse(null);
    }


    @PostMapping
    public void saveNewConnectivity(@RequestBody Connectivity connectivity){
        connectivityService.addConnectivity(connectivity);
    }

    @PutMapping("{id}")
    public void updateConnectivity(@PathVariable("id") long id, @RequestBody Connectivity connectivity){
        connectivityService.updateConnectivity(id, connectivity);
    }


}
