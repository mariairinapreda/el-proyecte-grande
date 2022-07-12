package com.codecool.brightxchange.model;

import lombok.NoArgsConstructor;

@NoArgsConstructor
abstract class BaseProduct {
    protected int id;
    protected float price;
    protected PriceCurrency currency;
    protected int quantity;
    protected Supplier supplier;


    public BaseProduct(int id,float price, PriceCurrency currency, int quantity, Supplier supplier) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
    }



}
