package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.productRelated.Connectivity;
import com.codecool.brightxchange.model.productRelated.CoolingSystem;
import com.codecool.brightxchange.model.productRelated.FrontPanel;
import com.codecool.brightxchange.model.productRelated.MotherBoardBackPanel;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "Desktop")
@Table(name = "desktop")
public class Desktop{
    @JsonProperty("desktopId")
    @Id
    @SequenceGenerator(
            name = "desktop_sequence",
            sequenceName = "desktop_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "desktop_sequence"
    )
    private int id;

    @JsonProperty("productPrice")
    private float price;

    @JsonProperty("productCurrency")
    @ManyToOne
    @JoinColumn(
            name = "price_currency_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_price_currency_fk"
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
                    name = "desktop_supplier_fk"
            )
    )
    private Supplier supplier;
    @JsonProperty("desktopProcessor")
    @ManyToOne
    @JoinColumn(
            name = "proccesor_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_processor_fk"
            )
    )
    private Processor processor;
    @JsonProperty("desktopGraphicsCard")
    @ManyToOne
    @JoinColumn(
            name = "graphic_card_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_graphic_card_fk"
            )
    )
    private GraphicsCard graphicsCard;
    @JsonProperty("desktopMotherboard")
    @ManyToOne
    @JoinColumn(
            name = "motherboard_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_motherboard_fk"
            )
    )
    private Motherboard motherboard;
    @JsonProperty("desktopMemory")
    @ManyToOne
    @JoinColumn(
            name = "memory_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_random_access_memory_fk"
            )
    )
    private RandomAccessMemory memory;
    @JsonProperty("desktopStorage")
    @ManyToOne
    @JoinColumn(
            name = "storage_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_storage_fk"
            )
    )
    private  Storage storage;
    @JsonProperty("desktopCase")
    @ManyToOne
    @JoinColumn(
            name = "case_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_case_fk"
            )
    )
    private Case desktopCase;
    @JsonProperty("desktopBackPanel")
    @ManyToOne
    @JoinColumn(
            name = "back_panel_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_mother_board_back_panel_fk"
            )
    )
    private MotherBoardBackPanel backPanel;
    @JsonProperty("desktopFrontPanel")
    @ManyToOne
    @JoinColumn(
            name = "fornt_panel_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_front_panel_fk"
            )
    )
    private FrontPanel frontPanel;
    @JsonProperty("desktopConnectivity")
    @ManyToOne
    @JoinColumn(
            name = "connectivity_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_connectivity_fk"
            )
    )
    private Connectivity connectivity;
    @JsonProperty("desktopCoolingSystem")
    @ManyToOne
    @JoinColumn(
            name = "cooling_system_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_cooling_system_fk"
            )
    )
    private CoolingSystem coolingSystem;
    @JsonProperty("desktopPowerSupply")
    @ManyToOne
    @JoinColumn(
            name = "power_supply_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "desktop_power_supply_fk"
            )
    )
    private PowerSupply powerSupply;
    @JsonProperty("desktopDescription")
    @Column(
            name = "description",
            columnDefinition = "TEXT"
    )
    private String description;

    public Desktop(int id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, Processor processor, GraphicsCard graphicsCard, Motherboard motherboard, RandomAccessMemory memory, Storage storage, Case desktopCase, MotherBoardBackPanel backPanel, FrontPanel frontPanel, Connectivity connectivity, CoolingSystem coolingSystem, PowerSupply powerSupply, String description) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
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
