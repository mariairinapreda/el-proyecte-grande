package com.codecool.brightxchange.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class ProductImage {
    @Id
    @SequenceGenerator(
            name = "image_sequence",
            sequenceName = "image_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "image_sequence"
    )
    private Long id;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Product product;

    @Column(
            columnDefinition = "TEXT"
    )
    private String imageUrl;

    public ProductImage(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
