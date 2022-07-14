package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
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
@Entity(name = "SSD")
@Table(name = "ssd")
public class SSD {
    @JsonProperty("ssdId")
    @Id
    @SequenceGenerator(
            name = "ssd_sequence",
            sequenceName = "ssd_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ssd_sequence"
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
                    name = "ssd_price_currency_fk"
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
                    name = "ssd_supplier_fk"
            )
    )
    private Supplier supplier;
    @JsonProperty("ssdConnectionInterface")
    @Column(
            name = "connection_interface",
            columnDefinition = "TEXT"
    )
    private String connectionInterface;
    @JsonProperty("ssdWriteSpeed")
    @Column( name = "write_speed")
    private Integer writeSpeed;
    @JsonProperty("ssdReadSpeed")
    @Column( name = "read_speed")
    private Integer readSpeed;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Storage> storages = new HashSet<>();

    public SSD(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, String connectionInterface, Integer writeSpeed, Integer readSpeed) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.connectionInterface = connectionInterface;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
    }

    public SSD(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, String connectionInterface, Integer writeSpeed, Integer readSpeed, Set<Storage> storages) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.connectionInterface = connectionInterface;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
        this.storages = storages;
    }
}
