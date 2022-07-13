package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class CoolingSystem {
    @JsonProperty("coolingSystemId")
    private int id;
    @JsonProperty("coolingSystemType")
    private String type;

    public CoolingSystem(int id, String type) {
        this.id = id;
        this.type = type;
    }
}
