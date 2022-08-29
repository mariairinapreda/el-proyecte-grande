package com.codecool.brightxchange.controller.caseControllers;

import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.service.producers.CaseProducerService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/case-producer")
public class CaseProducerController {

private CaseProducerService caseProducerService;

    public CaseProducerController(CaseProducerService caseProducerService) {
        this.caseProducerService = caseProducerService;
    }

    @GetMapping
    public List<CaseProducer> getAll(){
        return caseProducerService.getAll();
    }

    @GetMapping("{id}")
    public CaseProducer getById(@PathVariable("id") long id){
       return caseProducerService.getCaseProducerById(id).orElse(null);
    }


    @PostMapping
    public void saveNewCaseProducer(@RequestBody CaseProducer tempCaseProducer){
        caseProducerService.addCaseProducer(tempCaseProducer);
    }


    @PutMapping("{id}")
    public void updateCaseProduce(@PathVariable("id") long id, @RequestBody CaseProducer caseProducer){
        caseProducerService.update(id, caseProducer);
    }


}
