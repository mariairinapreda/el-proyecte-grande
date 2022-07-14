package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Data
@NoArgsConstructor
@Builder
public class Motherboard {
    @JsonProperty("motherboardId")
    private int id;
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
    @JsonProperty("motherboardChipsetProducer")
    private ChipsetProducer chipsetProducer;
    @JsonProperty("motherboardProducer")
    private MotherboardProducer motherboardProducer;
    @JsonProperty("motherboardChipset")
    private String chipset;
    @JsonProperty("motherboardNumberOfSATA3")
    private int numberOfSATA3;
    @JsonProperty("motherboardNumberOfM2")
    private int numberOfM2;

    public Motherboard(int id, ChipsetProducer chipsetProducer, MotherboardProducer motherboardProducer, String chipset, int numberOfSATA3, int numberOfM2) {
        this.id = id;
        this.chipsetProducer = chipsetProducer;
        this.motherboardProducer = motherboardProducer;
        this.chipset = chipset;
        this.numberOfSATA3 = numberOfSATA3;
        this.numberOfM2 = numberOfM2;
    }
}
