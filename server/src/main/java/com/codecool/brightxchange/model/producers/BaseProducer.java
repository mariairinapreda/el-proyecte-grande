package com.codecool.brightxchange.model.producers;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class BaseProducer {
    @JsonProperty("producerId")
    protected int id;
    @JsonProperty("producerName")
    protected String producer;

    public BaseProducer(int id, String producer) {
        this.id = id;
        this.producer = producer;
    }
}
