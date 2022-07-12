package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class GraphicsCard extends BaseProduct{
    private int id;

    private GraphicsCardFamily family;

    private GCModel model;

    private GraphicsCardMemoryType memoryType;

    private int videoMemory;

    private int busMemory;

    private String other;

    private GraphicsCardProducer producer;

    private GCConnectionInterface gcConnectionInterface;

    private GCSeries gcSeries;

    private String resolution;

    private int frequency;

    private VideoBackPanel backPanel;

    public GraphicsCard(int id, GraphicsCardFamily family, GCModel model, GraphicsCardMemoryType memoryType, int videoMemory, int busMemory, String other, GraphicsCardProducer producer, GCConnectionInterface gcConnectionInterface, GCSeries gcSeries, String resolution, int frequency, VideoBackPanel backPanel) {
        this.id = id;
        this.family = family;
        this.model = model;
        this.memoryType = memoryType;
        this.videoMemory = videoMemory;
        this.busMemory = busMemory;
        this.other = other;
        this.producer = producer;
        this.gcConnectionInterface = gcConnectionInterface;
        this.gcSeries = gcSeries;
        this.resolution = resolution;
        this.frequency = frequency;
        this.backPanel = backPanel;
    }
}
