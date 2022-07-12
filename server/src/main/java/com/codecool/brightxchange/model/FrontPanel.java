package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class FrontPanel {
    private int id;

    private int numberOfUSB2;

    private int numberOfUSB3;

    private int numberOfHeadphonesJack;

    private int numberOfHMicrophoneJack;

    public FrontPanel(int id, int numberOfUSB2, int numberOfUSB3, int numberOfHeadphonesJack, int numberOfHMicrophoneJack) {
        this.id = id;
        this.numberOfUSB2 = numberOfUSB2;
        this.numberOfUSB3 = numberOfUSB3;
        this.numberOfHeadphonesJack = numberOfHeadphonesJack;
        this.numberOfHMicrophoneJack = numberOfHMicrophoneJack;
    }
}
