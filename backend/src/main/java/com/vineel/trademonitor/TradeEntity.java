package com.vineel.trademonitor;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "trades")
public class TradeEntity {

    @Id
    private String id;
    private String trader;
    private String product;
    private String status;

    public TradeEntity() {
    }

    public TradeEntity(String id, String trader, String product, String status) {
        this.id = id;
        this.trader = trader;
        this.product = product;
        this.status = status;
    }

    public String getId() {
        return id;
    }

    public String getTrader() {
        return trader;
    }

    public String getProduct() {
        return product;
    }

    public String getStatus() {
        return status;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setTrader(String trader) {
        this.trader = trader;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}