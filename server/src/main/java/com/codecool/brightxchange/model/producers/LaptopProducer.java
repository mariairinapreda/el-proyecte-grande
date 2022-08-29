package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Laptop;
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
@Entity(name = "LaptopProducer")
@Table(
        name = "laptop_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class LaptopProducer{
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "laptop_producer_sequence",
            sequenceName = "laptop_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "laptop_producer_sequence"
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
    private Set<Laptop> laptops = new HashSet<>();

    public LaptopProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public LaptopProducer(Long id, String name, Set<Laptop> laptops) {
        this.id = id;
        this.name = name;
        this.laptops = laptops;
    }
}
