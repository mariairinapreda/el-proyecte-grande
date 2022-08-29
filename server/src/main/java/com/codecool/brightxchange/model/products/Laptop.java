package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.Display;
import com.codecool.brightxchange.model.producers.LaptopProducer;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Laptop")
@Table(name = "laptop")
public class Laptop {
    @JsonProperty("laptopId")
    @Id
    @SequenceGenerator(
            name = "laptop_sequence",
            sequenceName = "laptop_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "laptop_sequence"
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
                    name = "laptop_price_currency_fk"
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
                    name = "laptop_supplier_fk"
            )
    )
    private Supplier supplier;
    @JsonProperty("laptopLaptopProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_laptop_producer_fk"
            )
    )
    private LaptopProducer laptopProducer;
    @JsonProperty("laptopDisplay")
    @ManyToOne
    @JoinColumn(
            name = "display_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_display_fk"
            )
    )
    private Display display;
    @JsonProperty("laptopProcessor")
    @ManyToOne
    @JoinColumn(
            name = "processor_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_processor_fk"
            )
    )
    private Processor processor;
    @JsonProperty("laptopMemory")
    @ManyToOne
    @JoinColumn(
            name = "ram_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_random_access_memory_fk"
            )
    )
    private RandomAccessMemory memory;
    @JsonProperty("laptopStorage")
    @ManyToOne
    @JoinColumn(
            name = "storage_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_storage_fk"
            )
    )
    private Storage storage;
    @JsonProperty("laptopGraphicsCard")
    @ManyToOne
    @JoinColumn(
            name = "gc_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_graphics_card_fk"
            )
    )
    private GraphicsCard graphicsCard;
    @JsonProperty("laptopConnectivity")
    @ManyToOne
    @JoinColumn(
            name = "connectivity_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_connectivity_fk"
            )
    )
    private Connectivity connectivity;
    @JsonProperty("laptopBackPanel")
    @ManyToOne
    @JoinColumn(
            name = "back_panel_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "laptop_mother_board_back_panel_fk"
            )
    )
    private MotherBoardBackPanel backPanel;
    @JsonProperty("laptopDimensions")
    @Column(
            name = "dimensions",
            columnDefinition = "TEXT"
    )
    private String dimensions;
    @JsonProperty("laptopWeight")
    private Integer weight;

    public Laptop(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, LaptopProducer laptopProducer, Display display, Processor processor, RandomAccessMemory memory, Storage storage, GraphicsCard graphicsCard, Connectivity connectivity, MotherBoardBackPanel backPanel, String dimensions, Integer weight) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
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
