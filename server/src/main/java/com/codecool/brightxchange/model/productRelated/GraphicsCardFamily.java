package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class GraphicsCardFamily {
    @JsonProperty("graphicsCardFamilyId")
    private int id;
    @JsonProperty("graphicsCardFamilyName")
    private String name;

    public GraphicsCardFamily(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
