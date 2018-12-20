package com.kulgeiko.designpatterns.c_behavioral.strategy;


import java.math.BigDecimal;

public interface Discounter {
    BigDecimal applyDiscount(BigDecimal amount);
}

