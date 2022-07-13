package com.codecool.brightxchange.model.producers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    public MonitorProducer(Long id, String name) {
        this.id = id;
        this.name = name;
    }
}
