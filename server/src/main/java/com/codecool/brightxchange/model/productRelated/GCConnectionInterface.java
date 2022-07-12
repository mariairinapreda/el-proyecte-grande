package com.codecool.brightxchange.model.productRelated;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class GCConnectionInterface {
    private int id;
    private String name;

    public GCConnectionInterface(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
