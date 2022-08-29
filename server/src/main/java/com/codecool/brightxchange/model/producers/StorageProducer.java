package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Storage;
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
@Entity(name = "StorageProducer")
@Table(
        name = "storage_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class StorageProducer  {
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "storage_producer_sequence",
            sequenceName = "storage_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "storage_producer_sequence"
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
    private Set<Storage> storages = new HashSet<>();

    public StorageProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public StorageProducer(Long id, String name, Set<Storage> storages) {
        this.id = id;
        this.name = name;
        this.storages = storages;
    }
}
