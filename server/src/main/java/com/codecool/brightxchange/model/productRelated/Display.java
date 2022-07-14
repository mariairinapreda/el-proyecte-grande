package com.codecool.brightxchange.model.productRelated;

import com.codecool.brightxchange.model.products.Laptop;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

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

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();

    public Display(Long id, Float diagonal, String resolution, int refreshRate) {
        this.id = id;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }

    public Display(Long id, Float diagonal, String resolution, int refreshRate, Set<Laptop> laptops) {
        this.id = id;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.laptops = laptops;
    }
}
