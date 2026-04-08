package com.vineel.trademonitor;

public class Trade {
    private String id;
    private String trader;
    private String product;
    private String status;

    public Trade(String id, String trader, String product, String status) {
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
}
