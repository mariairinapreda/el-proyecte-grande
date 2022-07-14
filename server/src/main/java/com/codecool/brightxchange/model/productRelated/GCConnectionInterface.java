package com.codecool.brightxchange.model.productRelated;

import com.codecool.brightxchange.model.products.GraphicsCard;
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
@Entity(name = "GCConnectionInterface")
@Table(
        name = "gc_connection_interface",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class GCConnectionInterface {

    @JsonProperty("gcConnectionInterfaceId")
    @Id
    @SequenceGenerator(
            name = "gc_connection_interface_sequence",
            sequenceName = "gc_connection_interface_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "gc_connection_interface_sequence"
    )
    private Long id;
    @JsonProperty("gcConnectionInterfaceName")
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
    private Set<GraphicsCard> graphicsCards = new HashSet<>();

    public GCConnectionInterface(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public GCConnectionInterface(Long id, String name, Set<GraphicsCard> graphicsCards) {
        this.id = id;
        this.name = name;
        this.graphicsCards = graphicsCards;
    }
}
