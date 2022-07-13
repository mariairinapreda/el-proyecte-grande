package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class GCConnectionInterface {
    @JsonProperty("gcConnectionInterfaceId")
    private int id;
    @JsonProperty("gcConnectionInterfaceName")
    private String name;

    public GCConnectionInterface(int id, String name) {
        this.id = id;
        this.name = name;
    }
}
