package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class VideoBackPanel {
    private int id;
    private int numberOfVGA;
    private int numberOfDVI;
    private int numberOfHDMI;
    private int numberOfDisplayPort;
    private int numberOfJack;

    public VideoBackPanel(int id, int numberOfVGA, int numberOfDVI, int numberOfHDMI, int numberOfDisplayPort, int numberOfJack) {
        this.id = id;
        this.numberOfVGA = numberOfVGA;
        this.numberOfDVI = numberOfDVI;
        this.numberOfHDMI = numberOfHDMI;
        this.numberOfDisplayPort = numberOfDisplayPort;
        this.numberOfJack = numberOfJack;
    }
}
