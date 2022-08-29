package com.codecool.brightxchange.model.productRelated;

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
@Table(
        name = "connectivity",
        uniqueConstraints = {
                @UniqueConstraint(name = "connectivity_type_unique", columnNames = "type")
        }
)
@Entity(name = "Connectivity")
public class Connectivity {
    @Id
    @SequenceGenerator(
            name = "connectivity_id_sequence",
            sequenceName = "connectivity_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "connectivity_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    @JsonProperty("id")
    private Long id;
    @Column(
            name = "type",
            columnDefinition = "TEXT"
    )
    @JsonProperty("type")
    private String type;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();

    public Connectivity(Long id, String type) {
        this.id = id;
        this.type = type;
    }

    public Connectivity(Long id, String type, Set<Laptop> laptops) {
        this.id = id;
        this.type = type;
        this.laptops = laptops;
    }
}
