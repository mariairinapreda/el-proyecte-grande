package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productTypes.CaseType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Case extends BaseProduct {
    @JsonProperty("caseId")
    private int id;
    @JsonProperty("caseProducer")
    private CaseProducer caseProducer;
    @JsonProperty("caseModel")
    private String model;
    @JsonProperty("caseType")
    private CaseType caseType;
    @JsonProperty("caseNumberOfHDD")
    private int numberOfHDD;
    @JsonProperty("caseNumberOfSSD")
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
