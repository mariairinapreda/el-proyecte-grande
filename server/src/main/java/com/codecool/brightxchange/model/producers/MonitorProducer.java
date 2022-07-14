package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Monitor;
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
@Entity(name = "MonitorProducer")
@Table(
        name = "monitor_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class MonitorProducer{
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "monitor_producer_sequence",
            sequenceName = "monitor_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "monitor_producer_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    private Long id;

    @JsonProperty("name")
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
    private Set<Monitor> monitors = new HashSet<>();

    public MonitorProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public MonitorProducer(Long id, String name, Set<Monitor> monitors) {
        this.id = id;
        this.name = name;
        this.monitors = monitors;
    }
}
