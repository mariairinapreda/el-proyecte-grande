package com.codecool.brightxchange.model.producers;

import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class BaseProducer {
    protected int id;
    protected String producer;

    public BaseProducer(int id, String producer) {
        this.id = id;
        this.producer = producer;
    }
}
