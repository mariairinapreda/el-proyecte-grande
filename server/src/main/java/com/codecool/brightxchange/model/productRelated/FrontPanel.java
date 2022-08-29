package com.codecool.brightxchange.model.productRelated;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Table(name = "front_panel")
@Entity(name = "FrontPanel")
public class FrontPanel {
    @Id
    @SequenceGenerator(
            name = "front_panel_id_sequence",
            sequenceName = "front_panel_id_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "front_panel_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    @JsonProperty("frontPanelId")
    private Long id;
    @Column(name = "number_of_usb2")
    @JsonProperty("NumberOfUSB2")
    private Integer numberOfUSB2;
    @Column(name = "number_of_usb3")
    @JsonProperty("NumberOfUSB3")
    private Integer numberOfUSB3;
    @Column(name = "number_of_headphones_jack")
    @JsonProperty("NumberOfHeadphonesJack")
    private Integer numberOfHeadphonesJack;
    @Column(name = "number_of_microphone_jack")
    @JsonProperty("NumberOfMicrophoneJack")
    private Integer numberOfMicrophoneJack;

    public FrontPanel(Long id, Integer numberOfUSB2, Integer numberOfUSB3, Integer numberOfHeadphonesJack, Integer numberOfMicrophoneJack) {
        this.id = id;
        this.numberOfUSB2 = numberOfUSB2;
        this.numberOfUSB3 = numberOfUSB3;
        this.numberOfHeadphonesJack = numberOfHeadphonesJack;
        this.numberOfMicrophoneJack = numberOfMicrophoneJack;
    }
}
