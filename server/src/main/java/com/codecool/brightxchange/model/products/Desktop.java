package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Desktop extends BaseProduct {
    @JsonProperty("desktopId")
    private int id;
    @JsonProperty("desktopProcessor")
    private Processor processor;
    @JsonProperty("desktopGraphicsCard")
    private GraphicsCard graphicsCard;
    @JsonProperty("desktopMotherboard")
    private Motherboard motherboard;
    @JsonProperty("desktopMemory")
    private RandomAccessMemory memory;
    @JsonProperty("desktopStorage")
    private  Storage storage;
    @JsonProperty("desktopCase")
    private Case desktopCase;
    @JsonProperty("desktopBackPanel")
    private MotherBoardBackPanel backPanel;
    @JsonProperty("desktopFrontPanel")
    private FrontPanel frontPanel;
    @JsonProperty("desktopConnectivity")
    private Connectivity connectivity;
    @JsonProperty("desktopCoolingSystem")
    private CoolingSystem coolingSystem;
    @JsonProperty("desktopPowerSupply")
    private PowerSupply powerSupply;
    @JsonProperty("desktopDescription")
    private String description;

    public Desktop(int id, Processor processor, GraphicsCard graphicsCard, Motherboard motherboard, RandomAccessMemory memory, Storage storage, Case desktopCase, MotherBoardBackPanel backPanel, FrontPanel frontPanel, Connectivity connectivity, CoolingSystem coolingSystem, PowerSupply powerSupply, String description) {
        this.id = id;
        this.processor = processor;
        this.graphicsCard = graphicsCard;
        this.motherboard = motherboard;
        this.memory = memory;
        this.storage = storage;
        this.desktopCase = desktopCase;
        this.backPanel = backPanel;
        this.frontPanel = frontPanel;
        this.connectivity = connectivity;
        this.coolingSystem = coolingSystem;
        this.powerSupply = powerSupply;
        this.description = description;
    }
}
