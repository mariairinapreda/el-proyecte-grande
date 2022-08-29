package com.codecool.brightxchange.controller.desktopController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.productRelated.*;
import com.codecool.brightxchange.model.products.*;
import com.codecool.brightxchange.service.products.DesktopService;
import org.springframework.web.bind.annotation.*;

import java.security.PublicKey;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/desktop")
public class DesktopController {

    private DesktopService desktopService;

    public DesktopController(DesktopService desktopService) {
        this.desktopService = desktopService;
    }

    @GetMapping
    public List<Desktop> getAll(){
        return desktopService.getAll();
    }

    @GetMapping("{id}")
    public Desktop getById(@PathVariable("id") Long id){
        return desktopService.getDesktopById(id).orElse(null);
    }


    @PostMapping
    public void saveNewDesktop(@RequestBody Desktop desktop){
        desktopService.addDesktop(desktop);
    }

    @PutMapping("{id}")
    public void updateDesktop(@PathVariable("id") long id, @RequestBody Desktop desktop){
        desktopService.updateDesktop(id, desktop);
    }

    @PutMapping("{id}/processor")
    public void updateDesktopProcessor(@PathVariable("id") long id, @RequestBody Processor processor){
        desktopService.updateDesktopProcessor(id, processor);
    }

    @PutMapping("{id}/motherboard-back-panel")
    public void updateDesktopBackPanel(@PathVariable("id") long id, @RequestBody MotherBoardBackPanel motherBoardBackPanel){
        desktopService.updateDesktopBackPanel(id, motherBoardBackPanel);
    }

    @PutMapping("{id}/connectivity")
    public void updateDesktopConnectivity(@PathVariable("id") long id, @RequestBody Connectivity connectivity){
        desktopService.updateDesktopConnectivity(id, connectivity);
    }

    @PutMapping("{id}/cooling-system")
    public void updateDesktopCoolingSystem(@PathVariable("id") long id, @RequestBody CoolingSystem coolingSystem){
        desktopService.updateDesktopCoolingSystem(id, coolingSystem);
    }

    @PutMapping("{id}/random-access-memory")
    public void updateDesktopMemory(@PathVariable("id") long id, @RequestBody RandomAccessMemory randomAccessMemory){
        desktopService.updateDesktopMemory(id, randomAccessMemory);
    }

    @PutMapping("{id}/front-panel")
    public void updateDesktopFrontPanel(@PathVariable("id") long id, @RequestBody FrontPanel frontPanel){
        desktopService.updateDesktopFrontPanel(id, frontPanel);
    }

    @PutMapping("{id}/graphics-card")
    public void updateDesktopGraphicsCard(@PathVariable("id") long id, @RequestBody GraphicsCard graphicsCard){
        desktopService.updateDesktopGraphicsCard(id, graphicsCard);
    }

    @PutMapping("{id}/storage")
    public void updateDesktopStorage(@PathVariable("id") long id, @RequestBody Storage storage){
        desktopService.updateDesktopStorage(id, storage);
    }

    @PutMapping("{id}/supplier")
    public void updateDesktopSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        desktopService.updateDesktopSupplier(id, supplier);
    }

    @PutMapping("{id}/case")
    public void updateDesktopCase(@PathVariable("id")long id, @RequestBody Case updatedCase){
        desktopService.updateDesktopCase(id, updatedCase);
    }

    @PutMapping("{id}/motherboard")
    public void updateDesktopMotherBoard(@PathVariable("id") long id, @RequestBody Motherboard motherboard){
        desktopService.updateDesktopMotherBoard(id, motherboard);
    }

    @PutMapping("{id}/power-supply")
    public void updateDesktopPowerSupply(@PathVariable("id") long id, @RequestBody PowerSupply powerSupply){
        desktopService.updateDesktopPowerSupply(id, powerSupply);
    }



}
