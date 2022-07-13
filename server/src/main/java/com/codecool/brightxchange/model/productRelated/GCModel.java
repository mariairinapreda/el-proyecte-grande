package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class GCModel {
    @JsonProperty("gcModelId")
    private int id;
    @JsonProperty("gcModelName")
    private String name;

    public GCModel(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
