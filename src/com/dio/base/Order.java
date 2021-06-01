package com.dio.base;

import java.math.BigDecimal;

public class Order {

    private final String code;
    private final BigDecimal totalValue;

    public Order(String code, BigDecimal totalValue) {
        this.code = code;
        this.totalValue = totalValue;
    }

}