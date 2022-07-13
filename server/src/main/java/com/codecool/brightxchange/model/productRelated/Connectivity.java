package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor

public class Connectivity {
    @JsonProperty("connectivityId")
    private int id;
    @JsonProperty("connectivityType")
    private String connectivityType;

    public Connectivity(int id, String connectivityType) {
        this.id = id;
        this.connectivityType = connectivityType;
    }
}
