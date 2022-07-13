package com.codecool.brightxchange.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Currency;


@Data
@NoArgsConstructor
@Builder
public class PriceCurrency {
    @JsonProperty("priceId")
    private int id;
    @JsonProperty("priceCurrency")
    private Currency currency;

    public PriceCurrency(int id, Currency currency) {
        this.id = id;
        this.currency = currency;
    }
}
