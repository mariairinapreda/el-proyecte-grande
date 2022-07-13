package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@NoArgsConstructor
public class VideoBackPanel {
    @JsonProperty("videoBackPanelId")
    private int id;
    @JsonProperty("videoBackPanelNumberOfVGA")
    private int numberOfVGA;
    @JsonProperty("videoBackPanelNumberOfDVI")
    private int numberOfDVI;
    @JsonProperty("videoBackPanelNumberOfHDMI")
    private int numberOfHDMI;
    @JsonProperty("videoBackPanelNumberOfDisplayPort")
    private int numberOfDisplayPort;
    @JsonProperty("videoBackPanelNumberOfJack")
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
