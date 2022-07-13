package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.model.productRelated.*;
import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class GraphicsCard extends BaseProduct {
    @JsonProperty("graphicsCardId")
    private int id;
    @JsonProperty("graphicsCardFamily")
    private GraphicsCardFamily family;
    @JsonProperty("graphicsCardModel")
    private GCModel model;
    @JsonProperty("graphicsCardMemoryType")
    private GraphicsCardMemoryType memoryType;
    @JsonProperty("graphicsCardVideoMemory")
    private int videoMemory;
    @JsonProperty("graphicsCardBusMemory")
    private int busMemory;
    @JsonProperty("graphicsCardOther")
    private String other;
    @JsonProperty("graphicsCardProducer")
    private GraphicsCardProducer producer;
    @JsonProperty("gcConnectionInterface")
    private GCConnectionInterface gcConnectionInterface;
    @JsonProperty("gcSeries")
    private GCSeries gcSeries;
    @JsonProperty("gcResolution")
    private String resolution;
    @JsonProperty("gcFrequency")
    private int frequency;
    @JsonProperty("gcBackPanel")
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
