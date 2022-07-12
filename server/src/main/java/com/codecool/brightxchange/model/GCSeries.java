package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class GCSeries {
    private int id;
    private GraphicsCardFamily family;
    private String name;

    public GCSeries(int id, GraphicsCardFamily family, String name) {
        this.id = id;
        this.family = family;
        this.name = name;
    }
}
