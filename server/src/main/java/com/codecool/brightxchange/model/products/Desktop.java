package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Desktop extends BaseProduct {
    private int id;

    private Processor processor;

    private GraphicsCard graphicsCard;

    private Motherboard motherboard;

    private RandomAccessMemory memory;

    private  Storage storage;

    private Case desktopCase;

    private MotherBoardBackPanel backPanel;

    private FrontPanel frontPanel;

    private Connectivity connectivity;

    private CoolingSystem coolingSystem;

    private PowerSupply powerSupply;

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
