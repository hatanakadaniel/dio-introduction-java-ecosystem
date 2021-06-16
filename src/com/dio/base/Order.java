package com.dio.base;

public class Order {

    private final String code;

    public Order(String code) {
        this.code = code;
    }

    @Override
    public String toString() {
        return "Order={" +
                "code='" + code + "'" +
                "}";
    }

}