package com.codecool.brightxchange.controller.caseControllers;

import com.codecool.brightxchange.model.products.Case;
import com.codecool.brightxchange.service.PriceCurrencyService;
import com.codecool.brightxchange.service.SupplierService;
import com.codecool.brightxchange.service.producers.CaseProducerService;
import com.codecool.brightxchange.service.products.CaseService;
import com.codecool.brightxchange.service.types.CaseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/case")
public class CaseController {
    @Autowired
    private CaseService caseService;
    @Autowired
    private CaseProducerService caseProducerService;
    @Autowired
    private CaseTypeService caseTypeService;
    @Autowired
    private PriceCurrencyService priceCurrencyService;
    @Autowired
    private SupplierService supplierService;


    @GetMapping
    public List<Case> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public Case getById(@PathVariable("id") Long id){
        return null;
    }

    @PostMapping
    public void saveNewCase(@RequestBody Case tempCase){
        caseService.addCase(tempCase);
    }

}
