package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@Builder
@Entity(name = "Motherboard")
@Table(name = "motherboard")
public class Motherboard {
    @JsonProperty("motherboardId")
    @Id
    @SequenceGenerator(
            name = "motherboard_sequence",
            sequenceName = "motherboard_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "motherboard_sequence"
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
    @JsonProperty("motherboardChipsetProducer")
    @ManyToOne
    @JoinColumn(
            name = "chipset_producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "motherboard_chipset_producer_fk"
            )
    )
    private ChipsetProducer chipsetProducer;
    @JsonProperty("motherboardProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "motherboard_motherboard_producer_fk"
            )
    )
    private MotherboardProducer motherboardProducer;
    @JsonProperty("motherboardChipset")
    @Column(
            name = "chipset",
            columnDefinition = "TEXT"
    )
    private String chipset;
    @JsonProperty("motherboardNumberOfSATA3")
    @Column(name = "number_of_sata3")
    private Integer numberOfSATA3;
    @JsonProperty("motherboardNumberOfM2")
    @Column(name = "number_of_m2")
    private Integer numberOfM2;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Desktop> desktops = new HashSet<>();

    public Motherboard(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, ChipsetProducer chipsetProducer, MotherboardProducer motherboardProducer, String chipset, Integer numberOfSATA3, Integer numberOfM2, Set<Desktop> desktops) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.chipsetProducer = chipsetProducer;
        this.motherboardProducer = motherboardProducer;
        this.chipset = chipset;
        this.numberOfSATA3 = numberOfSATA3;
        this.numberOfM2 = numberOfM2;
        this.desktops = desktops;
    }
}
