package com.dio;

import com.dio.base.Order;

import java.math.BigDecimal;

public class MyFirstProgram {

    public static void main(String[] args) {
        final Order order = new Order("code1234", new BigDecimal("99.99"));
        System.out.println(order);
    }
}