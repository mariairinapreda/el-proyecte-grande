package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class MotherBoardBackPanel {
    @JsonProperty("motherBoardBackPanelId")
    private int id;
    @JsonProperty("motherBoardBackPanelNumberOfHDMI")
    private int numberOfHDMI;
    @JsonProperty("motherBoardBackPanelNumberOfDisplayPort")
    private int numberOfDisplayPort;
    @JsonProperty("motherBoardBackPanelNumberOfUSB2")
    private int numberOfUSB2;
    @JsonProperty("motherBoardBackPanelNumberOfUSB3_1_A")
    private int numberOfUSB3_1_A;
    @JsonProperty("motherBoardBackPanelNumberOfUSB3_2_A")
    private int numberOfUSB3_2_A;
    @JsonProperty("motherBoardBackPanelNumberOfUSB3_2_B")
    private int numberOfUSB3_2_B;
    @JsonProperty("motherBoardBackPanelNumberOfRJ45")
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
