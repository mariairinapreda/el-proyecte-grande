package com.codecool.brightxchange.controller.monitorController;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.codecool.brightxchange.model.products.Monitor;
import com.codecool.brightxchange.service.products.MonitorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/monitor")
public class MonitorController {
    private final MonitorService monitorService;

    public MonitorController(MonitorService monitorService) {
        this.monitorService = monitorService;
    }

    @GetMapping
    public List<Monitor> getAll(){
        return monitorService.getAll();
    }

    @GetMapping("{id}")
    public Monitor getById(@PathVariable("id") Long id){
        return monitorService.getById(id).get();
    }
   @PostMapping
   public void addMonitor(@RequestBody Monitor monitor){
        monitorService.addMonitor(monitor);
   }

   @PutMapping("{id}")
    public void updateMonitor(@PathVariable("id")long id, @RequestBody Monitor monitor){
        monitorService.updateMonitor(id, monitor.getPrice(),
                monitor.getQuantity(),
                monitor.getPower(),
                monitor.getDiagonal(),
                monitor.getDimensions(),
                monitor.getResponseTime(),
                monitor.getWeight(),
                monitor.getRefreshRate());
   }


   @PutMapping("{id}/monitor-producer")
    public void updateProducer(@PathVariable("id")long id, @RequestBody MonitorProducer monitorProducer){
        monitorService.updateMonitorProducer(id, monitorProducer);
   }
   @PutMapping("{id}/video-back-panel")
    public void updateBackPanel(@PathVariable("id")long id, @RequestBody VideoBackPanel backPanel){
        monitorService.updateVideoBackPanel(id, backPanel);
   }

   @PutMapping("{id}/monitor-supplier")
    public void updateSupplier(@PathVariable("id")long id, @RequestBody Supplier supplier){
        monitorService.updateSupplier(id, supplier);
   }


}
