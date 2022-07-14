package com.codecool.brightxchange.model.productTypes;

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
@Entity(name = "CaseType")
@Table(name = "case_type",
        uniqueConstraints = {
            @UniqueConstraint(name = "case_type_name_unique", columnNames = "name")
        }
)
public class CaseType{
    @Id
    @SequenceGenerator(
            name = "case_type_id_sequence",
            sequenceName = "case_type_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "case_type_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    @JsonProperty("id")
    private Long id;
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    @JsonProperty("name")
    private String name;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Case> cases = new HashSet<>();

    public CaseType(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public CaseType(Long id, String name, Set<Case> cases) {
        this.id = id;
        this.name = name;
        this.cases = cases;
    }
}
