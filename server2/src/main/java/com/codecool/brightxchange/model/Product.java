package com.codecool.brightxchange.model;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
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
    private List<ProductSpec> productSpecList;
    @OneToMany(cascade = {CascadeType.ALL})
    private List<ProductImage> images;

    @ManyToOne(cascade = {CascadeType.ALL})
    private Producer producer;



    public List<String> getImageNames(){
        List<String> imageName=new ArrayList<>();
        for (ProductImage image : images) {
            imageName.add(image.getImageUrl());
        }
        return imageName;
    }
}
