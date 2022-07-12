package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class HDD {
    private int id;
    private int rotationSpeed;
    private String connectionInterface;

    public HDD(int id, int rotationSpeed, String connectionInterface) {
        this.id = id;
        this.rotationSpeed = rotationSpeed;
        this.connectionInterface = connectionInterface;
    }
}
