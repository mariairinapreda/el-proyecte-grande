package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Laptop extends BaseProduct{
    private int id;
    private LaptopProducer laptopProducer;
    private Display display;
    private Processor processor;
    private RandomAccessMemory memory;
    private Storage storage;
    private GraphicsCard graphicsCard;
    private Connectivity connectivity;
    private MotherBoardBackPanel backPanel;
    private String dimensions;
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
