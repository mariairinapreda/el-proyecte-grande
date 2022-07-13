package com.codecool.brightxchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Supplier {
    @JsonProperty("supplierId")
    private int id;
    @JsonProperty("supplierName")
    private String name;

    public Supplier(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
