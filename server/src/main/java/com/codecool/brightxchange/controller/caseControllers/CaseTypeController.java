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

    @Autowired
    private CaseTypeService caseTypeService;

    @GetMapping
    public List<CaseType> getAll(){
        return null;
    }

    @GetMapping("{id}")
    public CaseType getById(@PathVariable("id") Long id){
        return null;
    }



}
