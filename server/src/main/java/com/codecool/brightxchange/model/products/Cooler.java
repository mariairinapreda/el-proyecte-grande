package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.products.BaseProduct;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Cooler extends BaseProduct {
    @JsonProperty("coolerId")
    private int id;
    @JsonProperty("coolerDescription")
    private String description;
    @JsonProperty("COOLERDimensions")
    private String dimensions;

    public Cooler(int id, String description, String dimensions) {
        this.id = id;
        this.description = description;
        this.dimensions = dimensions;
    }
}
