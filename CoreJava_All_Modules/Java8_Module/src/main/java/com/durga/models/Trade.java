package com.durga.models;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author Durganaresh - 3/23/2024
 * Hard work definitely pays off.
 * There is no substitute of hard work.
 * There is no shortcut to success.
 */
public class Trade {
    private AtomicInteger tradeId = new AtomicInteger();
    private int id = 0;
    private String instrument = null;
    private String status = null;
    private int quantity = 0;

    public Trade(int id) {
        this.id = id;
    }

    public Trade(String instrument, String status, int quantity) {
        this.instrument = instrument;
        this.status = status;
        this.quantity = quantity;
    }

    public Trade(int id, String instrument, String status, int quantity) {
        this.id = id;
        this.instrument = instrument;
        this.status = status;
        this.quantity = quantity;
    }
}
