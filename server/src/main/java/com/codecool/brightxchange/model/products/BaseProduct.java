package com.codecool.brightxchange.model.products;

import com.codecool.brightxchange.model.PriceCurrency;
import com.codecool.brightxchange.model.Supplier;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class BaseProduct {
    @JsonProperty("productId")
    protected int productId;
    @JsonProperty("productPrice")
    protected float price;
    @JsonProperty("productCurrency")
    protected PriceCurrency currency;
    @JsonProperty("productQuantity")
    protected int quantity;
    @JsonProperty("productSupplier")
    protected Supplier supplier;


    public BaseProduct(int productId, float price, PriceCurrency currency, int quantity, Supplier supplier) {
        this.productId = productId;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
    }



}
