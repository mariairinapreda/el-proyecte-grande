package com.codecool.brightxchange.model;

import com.codecool.brightxchange.model.products.*;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.node.ValueNode;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Data
@NoArgsConstructor
@Builder
@Entity(name = "Supplier")
@Table(
        name = "supplier",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class Supplier {
    @JsonProperty("supplierId")
    @Id
    @SequenceGenerator(
            name = "supplier_sequence",
            sequenceName = "supplier_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "supplier_sequence"
    )
    private Long id;
    @JsonProperty("supplierName")
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

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
    private Set<Processor> processors = new HashSet<>();

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


    public Supplier(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Supplier(Long id, String name, Set<Case> cases, Set<Cooler> coolers, Set<Desktop> desktops, Set<GraphicsCard> graphicsCards, Set<HDD> hdds, Set<SSD> ssds, Set<Vent> vents, Set<Storage> storages, Set<RandomAccessMemory> randomAccessMemories, Set<Processor> processors, Set<Monitor> monitors, Set<Laptop> laptops, Set<PowerSupply> powerSupplies) {
        this.id = id;
        this.name = name;
        this.cases = cases;
        this.coolers = coolers;
        this.desktops = desktops;
        this.graphicsCards = graphicsCards;
        this.hdds = hdds;
        this.ssds = ssds;
        this.vents = vents;
        this.storages = storages;
        this.randomAccessMemories = randomAccessMemories;
        this.processors = processors;
        this.monitors = monitors;
        this.laptops = laptops;
        this.powerSupplies = powerSupplies;
    }
}
