package com.codecool.brightxchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class CategoryImage {
    @Id
    @SequenceGenerator(
            name = "category_image_sequence",
            sequenceName = "category_image_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "category_image_sequence"
    )
    @JsonProperty("id")
    private Long id;

    @ManyToOne
    @JsonProperty("category")
    private Category category;

    @Column(
            columnDefinition = "TEXT"
    )
    @JsonProperty("imageUrl")
    private String imageUrl;
}
