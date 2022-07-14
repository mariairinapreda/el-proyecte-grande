package com.codecool.brightxchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Entity(name = "Supplier")
@Table(name = "supplier",
        uniqueConstraints = {
                @UniqueConstraint(name = "supplier_name_unique", columnNames = "name")
        }
)
public class Supplier {
    @Id
    @SequenceGenerator(
            name = "supplier_id_sequence",
            sequenceName = "supplier_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "supplier_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    @JsonProperty("supplierId")
    private int id;
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    @JsonProperty("supplierName")
    private String name;

    public Supplier(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
