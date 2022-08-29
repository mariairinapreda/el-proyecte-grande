package com.codecool.brightxchange.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Supplier {
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

    @Column(
            columnDefinition = "TEXT"
    )
    private String name;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<Product> products;
}
