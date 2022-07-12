package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
public class Monitor extends BaseProduct {
    private int id;
    private int diagonal;
    private String dimensions;
    private int responseTime;
    private int refreshRate;
    private int weight;
    private int power;
    private VideoBackPanel backPanel;
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
