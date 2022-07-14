package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.MonitorProducer;
import com.codecool.brightxchange.model.productRelated.VideoBackPanel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Monitor")
@Table(name = "monitor")
public class Monitor {
    @JsonProperty("monitorId")
    @Id
    @SequenceGenerator(
            name = "monitor_sequence",
            sequenceName = "monitor_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "monitor_sequence"
    )
    private Long id;

    @JsonProperty("productPrice")
    private float price;

    @JsonProperty("productCurrency")
    @ManyToOne
    @JoinColumn(
            name = "price_currency_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "monitor_price_currency_fk"
            )
    )
    private PriceCurrency currency;

    @JsonProperty("productQuantity")
    private Integer quantity;

    @JsonProperty("productSupplier")
    @ManyToOne
    @JoinColumn(
            name = "supplier_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "monitor_supplier_fk"
            )
    )
    private Supplier supplier;
    @JsonProperty("monitorDiagonal")
    private Integer diagonal;
    @JsonProperty("monitorDimensions")
    @Column(
            name = "dimensions",
            columnDefinition = "TEXT"
    )
    private String dimensions;
    @JsonProperty("monitorResponseTime")
    @Column(name = "response_time")
    private Integer responseTime;
    @JsonProperty("monitorRefreshRate")
    @Column(name = "refresh_rate")
    private Integer refreshRate;
    @JsonProperty("monitorWeight")
    private Integer weight;
    @JsonProperty("monitorPower")
    private Integer power;
    @JsonProperty("monitorBackPanel")
    @ManyToOne
    @JoinColumn(
            name = "video_back_panel_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "monitor_video_back_panel_fk"
            )
    )
    private VideoBackPanel backPanel;
    @JsonProperty("monitorProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "monitor_monitor_producer_fk"
            )
    )
    private MonitorProducer monitorProducer;

    public Monitor(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, Integer diagonal, String dimensions, Integer responseTime, Integer refreshRate, Integer weight, Integer power, VideoBackPanel backPanel, MonitorProducer monitorProducer) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
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
