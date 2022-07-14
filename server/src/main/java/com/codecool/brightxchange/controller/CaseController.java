package com.codecool.brightxchange.controller;

import com.codecool.brightxchange.model.products.Case;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/case")
public class CaseController {


        @GetMapping
        public List<Case> getAll(){
            return null;
        }

        @GetMapping("{id}")
        public Case getById(@PathVariable("id") Long id){
            return null;
        }

}
