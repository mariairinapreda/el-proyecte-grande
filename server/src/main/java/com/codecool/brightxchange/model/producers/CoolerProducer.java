package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Cooler;
import com.codecool.brightxchange.model.products.Motherboard;
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
@Entity(name = "CoolerProducer")
@Table(
        name = "cooler_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class CoolerProducer {
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "cooler_producer_sequence",
            sequenceName = "cooler_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cooler_producer_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @JsonProperty("name")
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
    private Set<Cooler> coolers = new HashSet<>();

    public CoolerProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CoolerProducer(Long id, String name, Set<Cooler> coolers) {
        this.id = id;
        this.name = name;
        this.coolers = coolers;
    }


}
