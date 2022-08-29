package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
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
public class Cooler {
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

    @JsonProperty("productPrice")
    private float price;

    @JsonProperty("productCurrency")
    @ManyToOne
    @JoinColumn(
            name = "price_currency_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "cooler_price_currency_fk"
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
                    name = "cooler_supplier_fk"
            )
    )
    private Supplier supplier;

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


    public Cooler(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, String description, String dimensions) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.description = description;
        this.dimensions = dimensions;
    }
}
