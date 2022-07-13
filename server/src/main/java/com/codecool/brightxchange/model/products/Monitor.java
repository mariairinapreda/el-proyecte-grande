package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Monitor extends BaseProduct {
    @JsonProperty("monitorId")
    private int id;
    @JsonProperty("monitorDiagonal")
    private int diagonal;
    @JsonProperty("monitorDimensions")
    private String dimensions;
    @JsonProperty("monitorResponseTime")
    private int responseTime;
    @JsonProperty("monitorRefreshRate")
    private int refreshRate;
    @JsonProperty("monitorWeight")
    private int weight;
    @JsonProperty("monitorPower")
    private int power;
    @JsonProperty("monitorBackPanel")
    private VideoBackPanel backPanel;
    @JsonProperty("monitorProducer")
    private MonitorProducer monitorProducer;

    public Monitor(int id, int diagonal, String dimensions, int responseTime, int refreshRate, int weight, int power, VideoBackPanel backPanel, MonitorProducer monitorProducer) {
        this.id = id;
        this.diagonal = diagonal;
        this.dimensions = dimensions;
        this.responseTime = responseTime;
        this.refreshRate = refreshRate;
        this.weight = weight;
        this.power = power;
        this.backPanel = backPanel;
        this.monitorProducer = monitorProducer;
    }
}
