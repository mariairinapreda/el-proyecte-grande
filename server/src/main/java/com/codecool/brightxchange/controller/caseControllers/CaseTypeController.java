package com.codecool.brightxchange.controller.caseControllers;

import com.codecool.brightxchange.model.productTypes.CaseType;
import com.codecool.brightxchange.service.types.CaseTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping("/case-type")
public class CaseTypeController {

    private final CaseTypeService caseTypeService;

    public CaseTypeController(CaseTypeService caseTypeService) {
        this.caseTypeService = caseTypeService;
    }

    @GetMapping
    public List<CaseType> getAll(){
        return  caseTypeService.getAll();
    }

    @GetMapping("{id}")
    public CaseType getById(@PathVariable("id") Long id){
        return caseTypeService.getById(id).orElse(null);
    }

    @PostMapping
    public void saveNewCaseType(@RequestBody CaseType caseType){
        caseTypeService.addCaseType(caseType);
    }

    @PutMapping("{id}")
    public void updateCaseType(@PathVariable("id")long id, @RequestBody CaseType caseType){
        caseTypeService.updateCaseType(id, caseType);
    }


}
