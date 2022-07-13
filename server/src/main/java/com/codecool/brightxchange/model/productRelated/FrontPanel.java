package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class FrontPanel {
    @JsonProperty("frontPanelId")
    private int id;
    @JsonProperty("frontPanelNumberOfUSB2")
    private int numberOfUSB2;
    @JsonProperty("frontPanelNumberOfUSB3")
    private int numberOfUSB3;
    @JsonProperty("frontPanelNumberOfHeadphonesJack")
    private int numberOfHeadphonesJack;
    @JsonProperty("frontPanelNumberOfHMicrophoneJack")
    private int numberOfHMicrophoneJack;

    public FrontPanel(int id, int numberOfUSB2, int numberOfUSB3, int numberOfHeadphonesJack, int numberOfHMicrophoneJack) {
        this.id = id;
        this.numberOfUSB2 = numberOfUSB2;
        this.numberOfUSB3 = numberOfUSB3;
        this.numberOfHeadphonesJack = numberOfHeadphonesJack;
        this.numberOfHMicrophoneJack = numberOfHMicrophoneJack;
    }
}
