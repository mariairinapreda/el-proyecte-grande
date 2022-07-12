package com.codecool.brightxchange.model.products;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class SSD {
    private int id;
    private String connectionInterface;
    private int writeSpeed;
    private int readSpeed;

    public SSD(int id, String connectionInterface, int writeSpeed, int readSpeed) {
        this.id = id;
        this.connectionInterface = connectionInterface;
        this.writeSpeed = writeSpeed;
        this.readSpeed = readSpeed;
    }
}
