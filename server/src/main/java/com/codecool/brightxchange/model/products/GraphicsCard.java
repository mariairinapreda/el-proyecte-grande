package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.GraphicsCardProducer;
import com.codecool.brightxchange.model.productRelated.*;
import com.codecool.brightxchange.model.productTypes.GraphicsCardMemoryType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "GraphicsCard")
@Table(name  = "graphics_card")
public class GraphicsCard {
    @JsonProperty("graphicsCardId")
    @Id
    @SequenceGenerator(
            name = "graphics_card_sequence",
            sequenceName = "graphics_card_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "graphics_card_sequence"
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
                    name = "graphics_card_price_currency_fk"
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
                    name = "graphics_card_supplier_fk"
            )
    )
    private Supplier supplier;
    @JsonProperty("graphicsCardFamily")
    @ManyToOne
    @JoinColumn(
            name = "graphics_card_family_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_graphics_card_family_fk"
            )
    )
    private GraphicsCardFamily family;
    @JsonProperty("graphicsCardModel")
    @ManyToOne
    @JoinColumn(
            name = "model_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_gc_model_fk"
            )
    )
    private GCModel model;
    @JsonProperty("graphicsCardMemoryType")
    @ManyToOne
    @JoinColumn(
            name = "graphic_card_type_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_graphic_card_memory_type_fk"
            )
    )
    private GraphicsCardMemoryType memoryType;

    @JsonProperty("graphicsCardVideoMemory")
    @Column(name= "video_memory")
    private Integer videoMemory;

    @JsonProperty("graphicsCardBusMemory")
    @Column(name= "bus_memory")
    private Integer busMemory;

    @JsonProperty("graphicsCardOther")
    @Column(
            name= "other",
            columnDefinition = "TEXT"
    )
    private String other;

    @JsonProperty("graphicsCardProducer")
    @ManyToOne
    @JoinColumn(
            name = "graphic_card_producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_graphic_card_producer_fk"
            )
    )
    private GraphicsCardProducer producer;
    @JsonProperty("gcConnectionInterface")
    @ManyToOne
    @JoinColumn(
            name = "gc_connection_interface_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_gc_connection_interface_fk"
            )
    )
    private GCConnectionInterface gcConnectionInterface;
    @JsonProperty("gcSeries")
    @ManyToOne
    @JoinColumn(
            name = "gc_series_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_gc_series_fk"
            )
    )
    private GCSeries gcSeries;

    @JsonProperty("gcResolution")
    @Column(
            name = "resolution",
            columnDefinition = "TEXT"
    )
    private String resolution;
    @JsonProperty("gcFrequency")
    private Integer frequency;
    @JsonProperty("gcBackPanel")
    @ManyToOne
    @JoinColumn(
            name = "back_panel_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "graphics_card_video_back_panel_fk"
            )
    )
    private VideoBackPanel backPanel;

    @OneToMany(
            orphanRemoval = true,
            cascade = {CascadeType.PERSIST, CascadeType.REMOVE},
            fetch = FetchType.LAZY
    )
    private Set<Laptop> laptops = new HashSet<>();

    public GraphicsCard(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, GraphicsCardFamily family, GCModel model, GraphicsCardMemoryType memoryType, Integer videoMemory, Integer busMemory, String other, GraphicsCardProducer producer, GCConnectionInterface gcConnectionInterface, GCSeries gcSeries, String resolution, Integer frequency, VideoBackPanel backPanel) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
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

    public GraphicsCard(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, GraphicsCardFamily family, GCModel model, GraphicsCardMemoryType memoryType, Integer videoMemory, Integer busMemory, String other, GraphicsCardProducer producer, GCConnectionInterface gcConnectionInterface, GCSeries gcSeries, String resolution, Integer frequency, VideoBackPanel backPanel, Set<Laptop> laptops) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
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
        this.laptops = laptops;
    }
}
