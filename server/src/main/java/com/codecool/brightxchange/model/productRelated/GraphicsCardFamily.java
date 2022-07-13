package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "GraphicsCardFamily")
@Table(
        name = "graphics_card_family",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
        )
public class GraphicsCardFamily {
    @JsonProperty("graphicsCardFamilyId")
    @Id
    @SequenceGenerator(
            name = "graphics_card_family_sequence",
            sequenceName = "graphics_card_family_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "graphics_card_family_sequence"
    )
    private Long id;
    @JsonProperty("graphicsCardFamilyName")
    @Column(
            name = "name",
            columnDefinition = "TEXT"
    )
    private String name;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<GCSeries> series = new HashSet<>();

    public GraphicsCardFamily(Long id, String name, Set<GCSeries> series) {
        this.id = id;
        this.name = name;
        this.series = series;
    }
}
