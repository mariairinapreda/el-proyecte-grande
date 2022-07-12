package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Builder
public class Motherboard extends BaseProduct{
    private int id;
    private ChipsetProducer chipsetProducer;
    private MotherboardProducer motherboardProducer;
    private String chipset;
    private int numberOfSATA3;
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
