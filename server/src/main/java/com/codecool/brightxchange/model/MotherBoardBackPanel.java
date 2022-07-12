package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class MotherBoardBackPanel {
    private int id;
    private int numberOfHDMI;
    private int numberOfDisplayPort;
    private int numberOfUSB2;
    private int numberOfUSB3_1_A;
    private int numberOfUSB3_2_A;
    private int numberOfUSB3_2_B;
    private int numberOfRJ45;

    public MotherBoardBackPanel(int id, int numberOfHDMI, int numberOfDisplayPort, int numberOfUSB2, int numberOfUSB3_1_A, int numberOfUSB3_2_A, int numberOfUSB3_2_B, int numberOfRJ45) {
        this.id = id;
        this.numberOfHDMI = numberOfHDMI;
        this.numberOfDisplayPort = numberOfDisplayPort;
        this.numberOfUSB2 = numberOfUSB2;
        this.numberOfUSB3_1_A = numberOfUSB3_1_A;
        this.numberOfUSB3_2_A = numberOfUSB3_2_A;
        this.numberOfUSB3_2_B = numberOfUSB3_2_B;
        this.numberOfRJ45 = numberOfRJ45;
    }
}
