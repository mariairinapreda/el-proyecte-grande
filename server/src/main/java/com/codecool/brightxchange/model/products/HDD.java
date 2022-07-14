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
@Entity(name = "HDD")
@Table(name = "hdd")
public class HDD {
    @Id
    @SequenceGenerator(
            name = "hdd_sequence",
            sequenceName = "hdd_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "hdd_sequence"
    )
    @JsonProperty("hddId")
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
                    name = "hdd_price_currency_fk"
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
                    name = "hdd_supplier_fk"
            )
    )
    private Supplier supplier;

    @JsonProperty("hddRotationSpeed")
    @Column(name ="rotation_speed")
    private Integer rotationSpeed;
    @JsonProperty("hddConnectionInterface")
    @Column(
            name = "connection_interface",
            columnDefinition = "TEXT"
    )
    private String connectionInterface;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Storage> storages = new HashSet<>();

    public HDD(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, Integer rotationSpeed, String connectionInterface, Set<Storage> storages) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.rotationSpeed = rotationSpeed;
        this.connectionInterface = connectionInterface;
        this.storages = storages;
    }
}
