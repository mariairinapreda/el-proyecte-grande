package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    public GCConnectionInterface(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
