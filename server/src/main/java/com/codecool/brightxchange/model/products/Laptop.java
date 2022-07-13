package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Laptop extends BaseProduct {
    @JsonProperty("laptopId")
    private int id;
    @JsonProperty("laptopLaptopProducer")
    private LaptopProducer laptopProducer;
    @JsonProperty("laptopDisplay")
    private Display display;
    @JsonProperty("laptopProcessor")
    private Processor processor;
    @JsonProperty("laptopMemory")
    private RandomAccessMemory memory;
    @JsonProperty("laptopStorage")
    private Storage storage;
    @JsonProperty("laptopGraphicsCard")
    private GraphicsCard graphicsCard;
    @JsonProperty("laptopConnectivity")
    private Connectivity connectivity;
    @JsonProperty("laptopBackPanel")
    private MotherBoardBackPanel backPanel;
    @JsonProperty("laptopDimensions")
    private String dimensions;
    @JsonProperty("laptopWeight")
    private int weight;

    public Laptop(int id, LaptopProducer laptopProducer, Display display, Processor processor, RandomAccessMemory memory, Storage storage, GraphicsCard graphicsCard, Connectivity connectivity, MotherBoardBackPanel backPanel, String dimensions, int weight) {
        this.id = id;
        this.laptopProducer = laptopProducer;
        this.display = display;
        this.processor = processor;
        this.memory = memory;
        this.storage = storage;
        this.graphicsCard = graphicsCard;
        this.connectivity = connectivity;
        this.backPanel = backPanel;
        this.dimensions = dimensions;
        this.weight = weight;
    }
}
