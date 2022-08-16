package com.codecool.brightxchange.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class CategorySpec {
    @Id
    @SequenceGenerator(
            name = "category_spec_sequence",
            sequenceName = "category_spec_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_spec_sequence"
    )
    private Long id;

    @Column(
            columnDefinition = "TEXT"
    )
    private String name;

    @Column(
            columnDefinition = "TEXT"
    )
    private String type;

    @ManyToOne
    private Category category;

}
