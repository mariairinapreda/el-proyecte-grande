package com.codecool.brightxchange.model.productTypes;

import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BaseType {
    protected int id;
    protected String name;

    public BaseType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
