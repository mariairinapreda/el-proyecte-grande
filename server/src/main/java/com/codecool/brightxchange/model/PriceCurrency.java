package com.codecool.brightxchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Currency;


@Data
@NoArgsConstructor
@Builder
@Entity(name="PriceCurrency")
@Table(name="price_currency",
uniqueConstraints = {
        @UniqueConstraint(name="price_currency_unique", columnNames = "currency")
}
)
public class PriceCurrency {
    @Id
    @SequenceGenerator(
            name = "price_currency_id_sequence",
            sequenceName = "price_currency_id_sequence",
            allocationSize = 1

    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "price_currency_id_sequence"
    )
    @Column(
            name = "id",
            updatable = false
    )
    @JsonProperty("priceId")
    private int id;

    @Column(
            name = "currency",
            columnDefinition = "TEXT"
    )
    @JsonProperty("priceCurrency")
    private Currency currency;

    public PriceCurrency(int id, Currency currency) {
        this.id = id;
        this.currency = currency;
    }
}
