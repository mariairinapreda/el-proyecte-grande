package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.products.BaseProduct;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Cooler extends BaseProduct {
    private int id;

    private String description;

    private String dimensions;

    public Cooler(int id, String description, String dimensions) {
        this.id = id;
        this.description = description;
        this.dimensions = dimensions;
    }
}
