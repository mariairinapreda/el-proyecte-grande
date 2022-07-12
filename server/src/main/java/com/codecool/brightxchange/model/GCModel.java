package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class GCModel {
    private int id;
    private String name;

    public GCModel(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
