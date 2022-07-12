package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Supplier {
    private int id;
    private String name;

    public Supplier(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
