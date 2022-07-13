package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Builder
@Table(name = "display")
@Entity(name = "Display")
public class Display {
    @Id
    @SequenceGenerator(
            name = "display_id_sequence",
            sequenceName = "display_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "display_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    @JsonProperty("id")
    private Long id;

    @Column(name = "diagonal")
    @JsonProperty("diagonal")
    private Float diagonal;
    @Column(name = "resolution")
    @JsonProperty("resolution")
    private String resolution;

    @Column(name = "refresh_rate")
    @JsonProperty("refresh_rate")
    private int refreshRate;

    public Display(Long id, Float diagonal, String resolution, int refreshRate) {
        this.id = id;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }
}
