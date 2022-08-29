package com.codecool.brightxchange.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductSpec {
    @Id
    @SequenceGenerator(
            name = "supplier_sequence",
            sequenceName = "supplier_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "supplier_sequence"
    )
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    private CategorySpec categorySpec;

    @Column(
            columnDefinition = "TEXT"
    )
    private String stringValue;
    private Long numberValue;
}
