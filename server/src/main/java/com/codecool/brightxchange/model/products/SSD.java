package com.codecool.brightxchange.model.products;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class SSD {
    @JsonProperty("ssdId")
    private int id;
    @JsonProperty("ssdConnectionInterface")
    private String connectionInterface;
    @JsonProperty("ssdWriteSpeed")
    private int writeSpeed;
    @JsonProperty("ssdReadSpeed")
    private int readSpeed;

    public SSD(int id, String connectionInterface, int writeSpeed, int readSpeed) {
        this.id = id;
        this.connectionInterface = connectionInterface;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
    }
}
