package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productTypes.CaseType;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Case extends BaseProduct {
    private int id;
    private CaseProducer caseProducer;
    private String model;
    private CaseType caseType;
    private int numberOfHDD;
    private int numberOfSSD;

    public Case(int id, CaseProducer caseProducer, String model, CaseType caseType, int numberOfHDD, int numberOfSSD) {
        this.id = id;
        this.caseProducer = caseProducer;
        this.model = model;
        this.caseType = caseType;
        this.numberOfHDD = numberOfHDD;
        this.numberOfSSD = numberOfSSD;
    }
}
