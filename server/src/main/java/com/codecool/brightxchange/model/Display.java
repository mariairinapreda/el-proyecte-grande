package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Display {
    private int id;
    private int diagonal;
    private String resolution;
    private int refreshRate;

    public Display(int id, int diagonal, String resolution, int refreshRate) {
        this.id = id;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }
}
