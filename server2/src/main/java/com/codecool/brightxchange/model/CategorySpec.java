package com.codecool.brightxchange.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Setter
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

    @JsonProperty("name")
    @Column(
            columnDefinition = "TEXT"
    )
    private String name;

    @JsonProperty("type")
    @Column(
            columnDefinition = "TEXT"
    )
    private String type;

    @JsonIgnore
    @ManyToOne(cascade = {CascadeType.ALL})
    private Category category;

}
