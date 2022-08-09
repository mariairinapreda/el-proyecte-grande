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
    private CaseService caseService;
    private CaseProducerService caseProducerService;
    private CaseTypeService caseTypeService;
    private PriceCurrencyService priceCurrencyService;
    private final SupplierService supplierService;

    public CaseController(SupplierService supplierService) {
        this.supplierService = supplierService;
    }

    @Autowired
    public CaseController(PriceCurrencyService priceCurrencyService) {
        this.priceCurrencyService = priceCurrencyService;
    }

    @Autowired
    public CaseController(CaseTypeService caseTypeService) {
        this.caseTypeService = caseTypeService;
    }

    @Autowired
    public CaseController(CaseProducerService caseProducerService) {
        this.caseProducerService = caseProducerService;
    }

    @Autowired
    public CaseController(CaseService caseService) {
        this.caseService = caseService;
    }


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
