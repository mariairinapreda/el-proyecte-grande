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
public class Product {
    @Id
    @SequenceGenerator(
            name = "product_sequence",
            sequenceName = "product_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "product_sequence"
    )
    private Long id;

    private Integer quantity;

    private Float price;

    @OneToMany(cascade = {CascadeType.ALL})
    private List<ProductImage> images;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Producer producer;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Supplier supplier;


}
