package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class GraphicsCardFamily {
    private int id;
    private String name;

    public GraphicsCardFamily(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
