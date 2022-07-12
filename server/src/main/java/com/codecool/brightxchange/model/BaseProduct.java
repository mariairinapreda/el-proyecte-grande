package com.codecool.brightxchange.model;

abstract class BaseProduct {
    protected int id;
    protected int price;
    protected PriceCurrency currency;
    protected int quantity;
    protected Supplier supplier;


    public BaseProduct(int price, PriceCurrency currency, int quantity, Supplier supplier) {
        this.id = id;
        this.price = price;
        this.currency = currency;
        this.quantity = quantity;
        this.supplier = supplier;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public PriceCurrency getCurrency() {
        return currency;
    }

    public void setCurrency(PriceCurrency currency) {
        this.currency = currency;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
