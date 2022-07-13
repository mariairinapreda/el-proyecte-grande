package com.codecool.brightxchange.model.productTypes;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
public abstract class BaseType {
    @JsonProperty("typeId")
    protected int id;
    @JsonProperty("typeName")
    protected String name;

    public BaseType(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
