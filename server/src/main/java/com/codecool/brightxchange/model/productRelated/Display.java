package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Display {
    @JsonProperty("displayId")
    private int id;
    @JsonProperty("displayDiagonal")
    private int diagonal;
    @JsonProperty("displayResolution")
    private String resolution;
    @JsonProperty("displayRefreshRate")
    private int refreshRate;

    public Display(int id, int diagonal, String resolution, int refreshRate) {
        this.id = id;
        this.diagonal = diagonal;
        this.resolution = resolution;
        this.refreshRate = refreshRate;
    }
}
