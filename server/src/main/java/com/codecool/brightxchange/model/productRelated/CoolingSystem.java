package com.codecool.brightxchange.model.productRelated;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class CoolingSystem {
    private int id;
    private String type;

    public CoolingSystem(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
