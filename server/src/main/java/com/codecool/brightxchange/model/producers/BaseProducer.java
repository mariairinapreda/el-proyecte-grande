package com.codecool.brightxchange.model.producers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class BaseProducer {
    @JsonProperty("producerId")
    protected int id;
    protected String name;
    @JsonProperty("producerName")
    protected String producer;

    public BaseProducer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
