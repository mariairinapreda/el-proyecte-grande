package com.codecool.brightxchange.model;

import com.codecool.brightxchange.model.products.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@Builder
@Entity(name = "PriceCurrency")
@Table(name = "price_currency")
public class PriceCurrency {
    @JsonProperty("priceId")
    @Id
    @SequenceGenerator(
            name = "price_currency_sequence",
            sequenceName = "price_currency_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "price_currency_sequence"
    )
    private Long id;
    @JsonProperty("currency")
    @Column(
            name = "currency",
            columnDefinition = "TEXT"
    )
    private Currency currency;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Case> cases = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Cooler> coolers = new HashSet<>();

    public PriceCurrency(Long id, Currency currency) {
        this.id = id;
        this.currency = currency;
    }
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
    private Set<Processor> processors = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<GraphicsCard> graphicsCards = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<HDD> hdds = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<SSD> ssds = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Vent> vents = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Storage> storages = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<RandomAccessMemory> randomAccessMemories = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Monitor> monitors = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<PowerSupply> powerSupplies = new HashSet<>();
    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Motherboard> motherboards = new HashSet<>();

    public PriceCurrency(Long id, Currency currency, Set<Case> cases, Set<Cooler> coolers, Set<Desktop> desktops, Set<Processor> processors, Set<GraphicsCard> graphicsCards, Set<HDD> hdds, Set<SSD> ssds, Set<Vent> vents, Set<Storage> storages, Set<RandomAccessMemory> randomAccessMemories, Set<Monitor> monitors, Set<Laptop> laptops, Set<PowerSupply> powerSupplies, Set<Motherboard> motherboards) {
        this.id = id;
        this.currency = currency;
        this.cases = cases;
        this.coolers = coolers;
        this.desktops = desktops;
        this.processors = processors;
        this.graphicsCards = graphicsCards;
        this.hdds = hdds;
        this.ssds = ssds;
        this.vents = vents;
        this.storages = storages;
        this.randomAccessMemories = randomAccessMemories;
        this.monitors = monitors;
        this.laptops = laptops;
        this.powerSupplies = powerSupplies;
        this.motherboards = motherboards;
    }
}
