package com.codecool.brightxchange.controller.monitorController;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.service.producers.MonitorProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/monitor-producer")
public class MonitorProducerController {
    private final MonitorProducerService monitorProducerService;

    public MonitorProducerController(MonitorProducerService monitorProducerService) {
        this.monitorProducerService = monitorProducerService;
    }

    @GetMapping
    public List<MonitorProducer> getAll(){
        return monitorProducerService.getAll();
    }

    @GetMapping("{id}")
    public MonitorProducer getById(@PathVariable("id") Long id){
        return monitorProducerService.getById(id).get();
    }

    @PostMapping
    public void addMonitorProducer(@RequestBody MonitorProducer monitorProducer){
        monitorProducerService.addMonitorProducer(monitorProducer);
    }

    @PutMapping("{id}")
    public void updateMonitorProducer(@PathVariable("id")long id, @RequestBody MonitorProducer monitorProducer){
        monitorProducerService.updateMonitorProducer(id, monitorProducer.getName());
    }



}
