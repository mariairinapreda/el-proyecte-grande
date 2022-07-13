package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JacksonInject;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "MotherBoardBackPanel")
@Table(name = "mother_board_back_panel")
public class MotherBoardBackPanel {
    @JsonProperty("motherBoardBackPanelId")
    @Id
    @SequenceGenerator(
            name = "mother_board_back_panel_sequence",
            sequenceName = "mother_board_back_panel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "mother_board_back_panel_sequence"
    )
    private Long id;
    @JsonProperty("motherBoardBackPanelNumberOfHDMI")
    @Column(name = "number_of_hdmi")
    private Integer numberOfHDMI;
    @JsonProperty("motherBoardBackPanelNumberOfDisplayPort")
    @Column(name = "number_of_display_port")
    private Integer numberOfDisplayPort;
    @JsonProperty("motherBoardBackPanelNumberOfUSB2")
    @Column(name = "number_of_usb2")
    private Integer numberOfUSB2;
    @JsonProperty("motherBoardBackPanelNumberOfUSB3_1_A")
    @Column(name = "number_of_usb3_1_a")
    private Integer numberOfUSB3_1_A;
    @JsonProperty("motherBoardBackPanelNumberOfUSB3_2_A")
    @Column(name = "number_of_usb3_2_a")
    private Integer numberOfUSB3_2_A;
    @JsonProperty("motherBoardBackPanelNumberOfUSB3_2_B")
    @Column(name = "number_of_usb3_2_b")
    private Integer numberOfUSB3_2_B;
    @JsonProperty("motherBoardBackPanelNumberOfRJ45")
    @Column(name = "number_of_rj45")
    private Integer numberOfRJ45;

    public MotherBoardBackPanel(Long id, Integer numberOfHDMI, Integer numberOfDisplayPort, Integer numberOfUSB2, Integer numberOfUSB3_1_A, Integer numberOfUSB3_2_A, Integer numberOfUSB3_2_B, Integer numberOfRJ45) {
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
