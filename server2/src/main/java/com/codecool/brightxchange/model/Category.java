package com.codecool.brightxchange.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;


@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(
        uniqueConstraints = {
                @UniqueConstraint(name = "category_name_unique", columnNames = "name")
        }
)
public class Category {
    @Id
    @SequenceGenerator(
            name = "category_sequence",
            sequenceName = "category_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_sequence"
    )
    @JsonProperty("id")
    private Long id;

    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    @JsonProperty("name")
    private String name;

    @OneToMany
    @JsonProperty("categorySpecs")
    private List<CategorySpec> categorySpecs;

    @OneToOne
    @JsonProperty("image")
    private CategoryImage image;

    @ManyToMany
    @JsonProperty("producers")
    private List<Producer> producers;

    @OneToMany
    @JsonProperty("products")
    private List<Product> products;


}
