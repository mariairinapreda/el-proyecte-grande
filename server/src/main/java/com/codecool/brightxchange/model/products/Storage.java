package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.StorageProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Storage")
@Table(name = "storage")
public class Storage{
    @JsonProperty("storageId")
    @Id
    @SequenceGenerator(
            name = "storage_sequence",
            sequenceName = "storage_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "storage_sequence"
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
                    name = "storage_price_currency_fk"
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
                    name = "storage_supplier_fk"
            )
    )
    private Supplier supplier;

    @JsonProperty("storageHDD")
    @ManyToOne
    @JoinColumn(
            name = "hdd_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "storage_hdd_fk"
            )
    )
    private HDD hdd;
    @JsonProperty("storageProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "storage_storage_producer_fk"
            )
    )
    private StorageProducer storageProducer;
    @JsonProperty("storageSSD")
    @ManyToOne
    @JoinColumn(
            name = "ssd_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "storage_ssd_fk"
            )
    )
    private SSD ssd;
    @JsonProperty("storageCapacity")
    private Integer capacity;
    @JsonProperty("storageUnit")
    @Column(
            name = "unit",
            columnDefinition = "TEXT"
    )
    private String unit;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();


    public Storage(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, HDD hdd, StorageProducer storageProducer, SSD ssd, Integer capacity, String unit) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.hdd = hdd;
        this.storageProducer = storageProducer;
        this.ssd = ssd;
        this.capacity = capacity;
        this.unit = unit;
    }

    public Storage(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, HDD hdd, StorageProducer storageProducer, SSD ssd, Integer capacity, String unit, Set<Laptop> laptops) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.hdd = hdd;
        this.storageProducer = storageProducer;
        this.ssd = ssd;
        this.capacity = capacity;
        this.unit = unit;
        this.laptops = laptops;
    }
}
