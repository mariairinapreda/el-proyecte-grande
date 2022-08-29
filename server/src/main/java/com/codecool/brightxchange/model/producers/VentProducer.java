package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Vent;
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
@Entity(name = "VentProducer")
@Table(
        name = "vent_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class VentProducer {
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "vent_producer_sequence",
            sequenceName = "vent_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "vent_producer_sequence"
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
    private Set<Vent> vents = new HashSet<>();

    public VentProducer(Long id, String name, Set<Vent> vents) {
        this.id = id;
        this.name = name;
        this.vents = vents;
    }
}
