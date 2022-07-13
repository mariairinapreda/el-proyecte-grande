package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Entity(name = "GCModel")
@Table(
        name = "gc_model",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class GCModel {
    @JsonProperty("gcModelId")
    @Id
    @SequenceGenerator(
            name = "gc_model_sequence",
            sequenceName = "gc_model_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "gc_model_sequence"
    )
    private Long id;
    @JsonProperty("gcModelName")
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

    public GCModel(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
