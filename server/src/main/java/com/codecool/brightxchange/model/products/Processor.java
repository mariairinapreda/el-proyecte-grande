package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.ProcessorProducer;
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
@Entity(name = "Processor")
@Table(name = "processor")
public class Processor {
    @JsonProperty("processorId")
    @Id
    @SequenceGenerator(
            name = "processor_sequence",
            sequenceName = "processor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "processor_sequence"
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
                    name = "processor_price_currency_fk"
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
                    name = "processor_supplier_fk"
            )
    )
    private Supplier supplier;
    
    @JsonProperty("processorProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "processor_processor_producer_fk"
            )
    )
    private ProcessorProducer producer;
    @JsonProperty("processorSocket")
    private Integer socket;
    @JsonProperty("processorCore")
    @Column(
            name = "core",
            columnDefinition = "TEXT"
    )
    private String core;
    @JsonProperty("processorNumberOfCores")
    @Column(name = "number_of_cores")
    private Integer numberOfCores;
    @JsonProperty("processorThreads")
    @Column(name = "threads")
    private Integer threads;
    @JsonProperty("processorFrequency")
    @Column(name = "frequency")
    private Integer frequency;
    @JsonProperty("processorFrequencyTurboMax")
    @Column(name = "frequency_turbo_max")
    private Integer frequencyTurboMax;
    @JsonProperty("processorProductionFactory")
    @Column(name = "production_factory")
    private Integer productionFactory;


    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Desktop> desktops = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();

    public Processor(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, ProcessorProducer producer, Integer socket, String core, Integer numberOfCores, Integer threads, Integer frequency, Integer frequencyTurboMax, Integer productionFactory, Set<Desktop> desktops, Set<Laptop> laptops) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.producer = producer;
        this.socket = socket;
        this.core = core;
        this.numberOfCores = numberOfCores;
        this.threads = threads;
        this.frequency = frequency;
        this.frequencyTurboMax = frequencyTurboMax;
        this.productionFactory = productionFactory;
        this.desktops = desktops;
        this.laptops = laptops;
    }
}
