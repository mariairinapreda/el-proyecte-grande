package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.VentProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Vent extends BaseProduct {
    @JsonProperty("ventId")
    private int id;
    @JsonProperty("ventRotationSpeed")
    private int rotationSpeed;
    @JsonProperty("ventsNumber")
    private int ventsNumber;
    @JsonProperty("ventDescription")
    private String description;
    @JsonProperty("ventDimensions")
    private String dimensions;
    @JsonProperty("ventProducer")
    private VentProducer ventProducer;
    @JsonProperty("ventDimensions")
    private int ventDimensions;

    public Vent(int id, int rotationSpeed, int ventsNumber, String description, String dimensions, VentProducer ventProducer, int ventDimensions) {
        this.id = id;
        this.rotationSpeed = rotationSpeed;
        this.ventsNumber = ventsNumber;
        this.description = description;
        this.dimensions = dimensions;
        this.ventProducer = ventProducer;
        this.ventDimensions = ventDimensions;
    }
}
