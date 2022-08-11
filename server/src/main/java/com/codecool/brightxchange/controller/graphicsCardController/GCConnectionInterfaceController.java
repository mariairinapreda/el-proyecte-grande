package com.codecool.brightxchange.controller.graphicsCardController;

import com.codecool.brightxchange.model.productRelated.GCConnectionInterface;
import com.codecool.brightxchange.service.productRelated.GCConnectionInterfaceService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/gc-connection-interface")
public class GCConnectionInterfaceController {

    private GCConnectionInterfaceService gcConnectionInterfaceService;


    @GetMapping
    public List<GCConnectionInterface> getAll(){
        return gcConnectionInterfaceService.getAll();
    }

    @GetMapping("{id}")
    public GCConnectionInterface getById(@PathVariable("id") Long id){
        return gcConnectionInterfaceService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewGCConnectionInterface(@RequestBody GCConnectionInterface gcConnectionInterface){
        gcConnectionInterfaceService.addConnectionInterface(gcConnectionInterface);
    }

    @PutMapping("{id}")
    public void updateGCConnectionInterface(@PathVariable("id") Long id, @RequestBody GCConnectionInterface gcConnectionInterface){
        gcConnectionInterfaceService.updateConnectionInterface(id, gcConnectionInterface);
    }

}
