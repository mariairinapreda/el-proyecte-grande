package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.VentProducer;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Vent extends BaseProduct {
    private int id;
    private int rotationSpeed;
    private int ventsNumber;
    private String description;
    private String dimensions;
    private VentProducer ventProducer;
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
