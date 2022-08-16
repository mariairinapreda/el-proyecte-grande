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
public class Producer {
    @Id
    @SequenceGenerator(
            name = "producer_sequence",
            sequenceName = "producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "producer_sequence"
    )
    private Long id;

    @Column(
            columnDefinition = "TEXT"
    )
    private String name;

    @ManyToMany
    private List<Category> categories;

    @OneToMany
    private List<Product> products;
}
