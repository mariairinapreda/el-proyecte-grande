package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.VentProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Vent")
@Table(name = "vent")
public class Vent {
    @JsonProperty("ventId")
    @Id
    @SequenceGenerator(
            name = "vent_sequence",
            sequenceName = "vent_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vent_sequence"
    )
    private Long id;

    @JsonProperty("productPrice")
    private float price;

    @Column(name = "model")
    @JsonProperty("model")
    private String model;
    @JsonProperty("productCurrency")
    @ManyToOne
    @JoinColumn(
            name = "price_currency_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "vent_price_currency_fk"
            )
    )
    private PriceCurrency currency;

    @JsonProperty("productQuantity")
    private Integer quantity;

    @JsonProperty("productSupplier")
    @ManyToOne
    @JoinColumn(
            name = "supplier_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "vent_supplier_fk"
            )
    )
    private Supplier supplier;

    @JsonProperty("ventRotationSpeed")
    @Column(name = "rotation_speed")
    private Integer rotationSpeed;

    @JsonProperty("ventsNumber")
    @Column(name = "vents_number")
    private Integer ventsNumber;

    @JsonProperty("ventDescription")
    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;

    @JsonProperty("dimensions")
    @Column(
            name = "dimensions",
            columnDefinition = "TEXT"
    )
    private String dimensions;

    @JsonProperty("ventProducer")
    @ManyToOne
    @JoinColumn(
            name = "vent_producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "vent_vent_producer_fk"
            )
    )
    private VentProducer ventProducer;

    @JsonProperty("ventDimensions")
    @Column(name = "vent_dimensions")
    private Integer ventDimensions;

    public Vent(Long id, float price,String model, PriceCurrency currency, Integer quantity, Supplier supplier, Integer rotationSpeed, Integer ventsNumber, String description, String dimensions, VentProducer ventProducer, Integer ventDimensions) {
        this.id = id;
        this.price = price;
        this.model=model;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.rotationSpeed = rotationSpeed;
        this.ventsNumber = ventsNumber;
        this.description = description;
        this.dimensions = dimensions;
        this.ventProducer = ventProducer;
        this.ventDimensions = ventDimensions;
    }
}
