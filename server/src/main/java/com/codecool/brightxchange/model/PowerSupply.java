package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class PowerSupply extends BaseProduct {
    private int id;
    private PowerSupplyProducer powerSupplyProducer;
    private PowerSupplyType powerSupplyType;
    private int power;
    private String certification;

    public PowerSupply(int id, PowerSupplyProducer powerSupplyProducer, PowerSupplyType powerSupplyType, int power, String certification) {
        this.id = id;
        this.powerSupplyProducer = powerSupplyProducer;
        this.powerSupplyType = powerSupplyType;
        this.power = power;
        this.certification = certification;
    }
}
