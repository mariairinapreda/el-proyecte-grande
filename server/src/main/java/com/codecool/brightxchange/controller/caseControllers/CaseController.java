package com.codecool.brightxchange.controller.caseControllers;

import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productTypes.CaseType;
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

    @Autowired
    public CaseController(CaseService caseService, CaseProducerService caseProducerService, CaseTypeService caseTypeService, PriceCurrencyService priceCurrencyService, SupplierService supplierService) {
        this.caseService = caseService;
        this.caseProducerService = caseProducerService;
        this.caseTypeService = caseTypeService;
        this.priceCurrencyService = priceCurrencyService;
        this.supplierService = supplierService;
    }

    @GetMapping
    public List<Case> getAll(){
        return caseService.getAll();
    }

    @GetMapping("{id}")
    public Case getById(@PathVariable("id") Long id){
        return caseService.getCaseById(id).orElse(null);
    }

    @PostMapping
    public void saveNewCase(@RequestBody Case tempCase){
        caseService.addCase(tempCase);
    }

    @PutMapping("{id}")
    public void updateCase(@PathVariable("id") long id, @RequestBody Case updatedCase){
        caseService.updateCase(id, updatedCase);
    }

    @PutMapping("{id}")
    public void updateCaseSupplier(@PathVariable("id") long id, @RequestBody Supplier  supplier){
        caseService.updateTheSupplier(id, supplier);
    }

    @PutMapping({"id"})
    public void updateCaseProducer(@PathVariable("id") long id, @RequestBody CaseProducer caseProducer){
        caseService.updateProducer(id, caseProducer);
    }

    @PutMapping({"id"})
    public void updateCaseType(@PathVariable("id") long id, @RequestBody CaseType caseType){
        caseService.updateType(id, caseType);
    }

}
