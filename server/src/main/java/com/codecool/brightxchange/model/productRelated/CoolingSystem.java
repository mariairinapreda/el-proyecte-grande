package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Table(
        name = "cooling_system",
        uniqueConstraints = {
                @UniqueConstraint(name = "cooling_system_unique", columnNames = "type")
        }
)
@Entity(name = "CoolingSystem")
public class CoolingSystem {
    @Id
    @SequenceGenerator(
            name = "cooling_system_id_sequence",
            sequenceName = "cooling_system_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "cooling_system_id_sequence"
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

    public CoolingSystem(Long id, String type) {
        this.id = id;
        this.type = type;
    }
}
