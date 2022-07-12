package com.codecool.brightxchange.model;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.Currency;


@Data
@NoArgsConstructor
@Builder
public class PriceCurrency {
    private int id;
    private Currency currency;

    public PriceCurrency(int id, Currency currency) {
        this.id = id;
        this.currency = currency;
    }
}
