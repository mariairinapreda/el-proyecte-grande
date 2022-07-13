package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    public GraphicsCardFamily(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
