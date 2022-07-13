package com.codecool.brightxchange.model.productTypes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "PowerSupplyType")
@Table(name = "power_supply_type",
        uniqueConstraints = {
                @UniqueConstraint(name = "power_supply_type_name_unique", columnNames = "name")
        }
)
public class PowerSupplyType{
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

    public PowerSupplyType(Long id, String name) {
        this.id = id;
        this.name = name;
    }


}
