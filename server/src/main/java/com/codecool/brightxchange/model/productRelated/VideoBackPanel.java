package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Builder
@Data
@NoArgsConstructor
@Entity(name = "VideoBackPanel")
@Table(name = "video_back_panel")
public class VideoBackPanel {
    @JsonProperty("videoBackPanelId")
    @Id
    @SequenceGenerator(
            name = "video_back_panel_sequence",
            sequenceName = "video_back_panel_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "video_back_panel_sequence"
    )
    private Long id;
    @JsonProperty("videoBackPanelNumberOfVGA")
    @Column(name = "number_of_vga")
    private Integer numberOfVGA;
    @Column(name = "number_of_dvi")
    @JsonProperty("videoBackPanelNumberOfDVI")
    private Integer numberOfDVI;
    @JsonProperty("videoBackPanelNumberOfHDMI")
    @Column(name = "number_of_hdmi")
    private Integer numberOfHDMI;
    @JsonProperty("videoBackPanelNumberOfDisplayPort")
    @Column(name = "number_of_display_port")
    private Integer numberOfDisplayPort;
    @Column(name = "number_of_jack")
    @JsonProperty("videoBackPanelNumberOfJack")
    private Integer numberOfJack;

    public VideoBackPanel(Long id, Integer numberOfVGA, Integer numberOfDVI, Integer numberOfHDMI, Integer numberOfDisplayPort, Integer numberOfJack) {
        this.id = id;
        this.numberOfVGA = numberOfVGA;
        this.numberOfDVI = numberOfDVI;
        this.numberOfHDMI = numberOfHDMI;
        this.numberOfDisplayPort = numberOfDisplayPort;
        this.numberOfJack = numberOfJack;
    }
}
