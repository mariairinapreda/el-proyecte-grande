package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.RAMProducer;
import com.codecool.brightxchange.model.productTypes.RandomAccessMemoryType;
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
@Entity(name = "RandomAccessMemory")
@Table(name = "random_access_memory")
public class RandomAccessMemory {
    @JsonProperty("ramId")
    @Id
    @SequenceGenerator(
            name = "random_access_memory_sequence",
            sequenceName = "random_access_memory_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "random_access_memory_sequence"
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
                    name = "random_access_memory_price_currency_fk"
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
                    name = "random_access_memory_supplier_fk"
            )
    )
    private Supplier supplier;

    @JsonProperty("ramProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "random_access_memory_ram_producer_fk"
            )
    )
    private RAMProducer ramProducer;
    @JsonProperty("memoryType")
    @ManyToOne
    @JoinColumn(
            name = "type_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "random_access_memory_random_access_memory_type_fk"
            )
    )
    private RandomAccessMemoryType memoryType;
    @JsonProperty("ramCapacity")
    private Integer capacity;
    @JsonProperty("ramFrequency")
    private Integer frequency;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();

    public RandomAccessMemory(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, RAMProducer ramProducer, RandomAccessMemoryType memoryType, Integer capacity, Integer frequency) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.ramProducer = ramProducer;
        this.memoryType = memoryType;
        this.capacity = capacity;
        this.frequency = frequency;
    }

    public RandomAccessMemory(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, RAMProducer ramProducer, RandomAccessMemoryType memoryType, Integer capacity, Integer frequency, Set<Laptop> laptops) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.ramProducer = ramProducer;
        this.memoryType = memoryType;
        this.capacity = capacity;
        this.frequency = frequency;
        this.laptops = laptops;
    }
}
