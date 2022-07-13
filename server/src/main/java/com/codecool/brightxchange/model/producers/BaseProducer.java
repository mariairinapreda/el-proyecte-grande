package com.codecool.brightxchange.model.producers;

import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class BaseProducer {
    protected int id;
    protected String name;

    public BaseProducer(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
