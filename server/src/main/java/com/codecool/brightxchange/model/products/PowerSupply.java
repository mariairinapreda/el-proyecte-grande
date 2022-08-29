package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.codecool.brightxchange.model.producers.PowerSupplyProducer;
import com.codecool.brightxchange.model.productTypes.PowerSupplyType;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@Builder
@NoArgsConstructor
@Entity(name = "PowerSupply")
@Table(name = "power_supply")
public class PowerSupply {
    @JsonProperty("powerSupplyId")
    @Id
    @SequenceGenerator(
            name = "power_supply_sequence",
            sequenceName = "power_supply_sequence",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "power_supply_sequence"
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
                    name = "power_supply_price_currency_fk"
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
                    name = "power_supply_supplier_fk"
            )
    )
    private Supplier supplier;
    @JsonProperty("powerSupplyProducer")
    @ManyToOne
    @JoinColumn(
            name = "producer_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "power_supply_power_supply_producer_fk"
            )
    )
    private PowerSupplyProducer powerSupplyProducer;
    @JsonProperty("powerSupplyType")
    @ManyToOne
    @JoinColumn(
            name = "type_id",
            nullable = false,
            referencedColumnName = "id",
            foreignKey = @ForeignKey(
                    name = "power_supply_power_supply_type_fk"
            )
    )
    private PowerSupplyType powerSupplyType;
    @JsonProperty("powerSupplyPower")
    private Integer power;
    @JsonProperty("powerSupplyCertification")
    @Column(
            name = "certification",
            columnDefinition = "TEXT"
    )
    private String certification;

    public PowerSupply(Long id, float price, PriceCurrency currency, Integer quantity, Supplier supplier, PowerSupplyProducer powerSupplyProducer, PowerSupplyType powerSupplyType, Integer power, String certification) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
        this.powerSupplyProducer = powerSupplyProducer;
        this.powerSupplyType = powerSupplyType;
        this.power = power;
        this.certification = certification;
    }
}
