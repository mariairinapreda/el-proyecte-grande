package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.ChipsetProducer;
import com.codecool.brightxchange.model.producers.MotherboardProducer;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Motherboard extends BaseProduct {
    @JsonProperty("motherboardId")
    private int id;
    @JsonProperty("motherboardChipsetProducer")
    private ChipsetProducer chipsetProducer;
    @JsonProperty("motherboardProducer")
    private MotherboardProducer motherboardProducer;
    @JsonProperty("motherboardChipset")
    private String chipset;
    @JsonProperty("motherboardNumberOfSATA3")
    private int numberOfSATA3;
    @JsonProperty("motherboardNumberOfM2")
    private int numberOfM2;

    public Motherboard(int id, ChipsetProducer chipsetProducer, MotherboardProducer motherboardProducer, String chipset, int numberOfSATA3, int numberOfM2) {
        this.id = id;
        this.chipsetProducer = chipsetProducer;
        this.motherboardProducer = motherboardProducer;
        this.chipset = chipset;
        this.numberOfSATA3 = numberOfSATA3;
        this.numberOfM2 = numberOfM2;
    }
}
