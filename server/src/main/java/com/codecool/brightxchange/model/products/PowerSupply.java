package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class PowerSupply extends BaseProduct {
    @JsonProperty("powerSupplyId")
    private int id;
    @JsonProperty("powerSupplyProducer")
    private PowerSupplyProducer powerSupplyProducer;
    @JsonProperty("powerSupplyType")
    private PowerSupplyType powerSupplyType;
    @JsonProperty("powerSupplyPower")
    private int power;
    @JsonProperty("powerSupplyCertification")
    private String certification;

    public PowerSupply(int id, PowerSupplyProducer powerSupplyProducer, PowerSupplyType powerSupplyType, int power, String certification) {
        this.id = id;
        this.powerSupplyProducer = powerSupplyProducer;
        this.powerSupplyType = powerSupplyType;
        this.power = power;
        this.certification = certification;
    }
}
