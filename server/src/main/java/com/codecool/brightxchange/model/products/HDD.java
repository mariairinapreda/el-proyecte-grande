package com.codecool.brightxchange.model.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class HDD {
    @JsonProperty("hddId")
    private int id;
    @JsonProperty("hddRotationSpeed")
    private int rotationSpeed;
    @JsonProperty("hddConnectionInterface")
    private String connectionInterface;

    public HDD(int id, int rotationSpeed, String connectionInterface) {
        this.id = id;
        this.rotationSpeed = rotationSpeed;
        this.connectionInterface = connectionInterface;
    }
}
