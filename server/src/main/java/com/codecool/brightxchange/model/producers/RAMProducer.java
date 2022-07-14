package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.RandomAccessMemory;
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
@Entity(name = "RAMProducer")
@Table(
        name = "ram_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class RAMProducer {
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "ram_producer_sequence",
            sequenceName = "ram_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "ram_producer_sequence"
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
    private Set<RandomAccessMemory> randomAccessMemories = new HashSet<>();

    public RAMProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public RAMProducer(Long id, String name, Set<RandomAccessMemory> randomAccessMemories) {
        this.id = id;
        this.name = name;
        this.randomAccessMemories = randomAccessMemories;
    }
}
