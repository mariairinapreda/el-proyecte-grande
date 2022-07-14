package com.codecool.brightxchange.controller.caseControllers;

import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.service.producers.CaseProducerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/case-producer")
public class CaseProducerController {



    @GetMapping
    public List<CaseProducer> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public CaseProducer getById(@PathVariable("id") Long id){
        return null;
    }


}
