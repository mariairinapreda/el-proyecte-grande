package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.service.types.CaseTypeService;
import com.codecool.brightxchange.model.productTypes.CaseType;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@CrossOrigin
@RestController
@RequestMapping(("/demo"))
public class DemoController {
    @Qualifier("CaseTypeService")
    CaseTypeService service ;
    @GetMapping
    public Set<String> getStrings(){
        Set<String> strings = new HashSet<>();
        strings.add("a");
        strings.add("b");
        strings.add("c");
        strings.add("d");
        strings.add("e");
        return strings;
    }

    @GetMapping("case")
    public List<CaseType> getAll(){
        return service.getAll();
    }
}
