package com.codecool.brightxchange.model.productRelated;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor

public class Connectivity {
    private int id;
    private String connectivityType;

    public Connectivity(int id, String connectivityType) {
        this.id = id;
        this.connectivityType = connectivityType;
    }
}
