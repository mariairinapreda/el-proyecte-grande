package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class GCSeries {
    @JsonProperty("gcSeriesId")
    private int id;
    @JsonProperty("gcSeriesFamily")
    private GraphicsCardFamily family;
    @JsonProperty("gcSeriesName")
    private String name;

    public GCSeries(int id, GraphicsCardFamily family, String name) {
        this.id = id;
        this.family = family;
        this.name = name;
    }
}
