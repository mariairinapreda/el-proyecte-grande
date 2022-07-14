package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.products.BaseProduct;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Cooler")
@Table(name = "cooler")
public class Cooler extends BaseProduct {
    @JsonProperty("coolerId")
    @Id
    @SequenceGenerator(
            name = "cooler_sequence",
            sequenceName = "cooler_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cooler_sequence"
    )
    private Long id;
    @JsonProperty("coolerDescription")
    @Column(
            name = "descripton",
            columnDefinition = "TEXT"
    )
    private String description;
    @JsonProperty("COOLERDimensions")
    @Column(
            name = "dimensions",
            columnDefinition = "TEXT"
    )
    private String dimensions;

    public Cooler(Long id, String description, String dimensions) {
        this.id = id;
        this.description = description;
        this.dimensions = dimensions;
    }
}
