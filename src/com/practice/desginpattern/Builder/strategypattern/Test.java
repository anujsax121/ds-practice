package com.practice.desginpattern.Builder.strategypattern;

import java.math.BigDecimal;

public class Test {

    public static void main(String[] args) {
       Discount discount = account -> account.multiply(BigDecimal.valueOf(0.9));
        BigDecimal newYear = discount.discount(BigDecimal.valueOf(10));

    }
}
