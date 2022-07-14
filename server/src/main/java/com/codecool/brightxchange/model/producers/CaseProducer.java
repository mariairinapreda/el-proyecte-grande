package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Case;
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
@Entity(name = "CaseProducer")
@Table(
        name = "case_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class CaseProducer{
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "case_producer_sequence",
            sequenceName = "case_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "case_producer_sequence"
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
    private Set<Case> cases = new HashSet<>();

    public CaseProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CaseProducer(Long id, String name, Set<Case> cases) {
        this.id = id;
        this.name = name;
        this.cases = cases;
    }
}
