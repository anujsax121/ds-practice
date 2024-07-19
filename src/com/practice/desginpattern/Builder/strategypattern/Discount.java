package com.practice.desginpattern.Builder.strategypattern;


import java.math.BigDecimal;

// Strategy Design Pattern is behaviour design pattern that allow to us change the behaviour of an algorithm at runtime.
//Strategy design pattern is one of the behavioral design pattern. Strategy is used when We hav multiple algorithms for specific task.
// and client decides the actual implementation to be used at runtime.
public interface Discount {

    BigDecimal discount(BigDecimal bigDecimal);
}

