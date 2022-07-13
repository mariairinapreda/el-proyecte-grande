package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.CaseProducer;
import com.codecool.brightxchange.model.productTypes.CaseType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Case{
    @JsonProperty("caseId")
    private int id;

    @JsonProperty("productPrice")
    protected float price;

    @JsonProperty("productCurrency")
    protected PriceCurrency currency;

    @JsonProperty("productQuantity")
    protected int quantity;

    @JsonProperty("productSupplier")
    protected Supplier supplier;

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

    public Case(int id, float price, PriceCurrency currency, int quantity, Supplier supplier, CaseProducer caseProducer, String model, CaseType caseType, int numberOfHDD, int numberOfSSD) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.caseProducer = caseProducer;
        this.model = model;
        this.caseType = caseType;
        this.numberOfHDD = numberOfHDD;
        this.numberOfSSD = numberOfSSD;
    }
}
