package com.codecool.brightxchange.model.producers;

import com.codecool.brightxchange.model.products.Desktop;
import com.codecool.brightxchange.model.products.Processor;
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
@Entity(name = "ProcessorProducer")
@Table(
        name = "processor_producer",
        uniqueConstraints = {
                @UniqueConstraint(name = "name_unique", columnNames = "name")
        }
)
public class ProcessorProducer{
    @JsonProperty("id")
    @Id
    @SequenceGenerator(
            name = "processor_producer_sequence",
            sequenceName = "processor_producer_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "processor_producer_sequence"
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
    private Set<Processor> processors = new HashSet<>();

    public ProcessorProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public ProcessorProducer(Long id, String name, Set<Processor> processors) {
        this.id = id;
        this.name = name;
        this.processors = processors;
    }
}
