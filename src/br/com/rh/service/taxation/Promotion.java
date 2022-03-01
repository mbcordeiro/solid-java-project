package br.com.rh.service.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Promotion implements TaxableReadjustment{
    private BigDecimal value;
    private LocalDate date;

    public Promotion(BigDecimal value, LocalDate date) {
        this.value = value;
        this.date = date;
    }

    @Override
    public BigDecimal value() {
        return value;
    }

    @Override
    public LocalDate date() {
        return date;
    }

    @Override
    public BigDecimal incomeTaxAmount() {
        return value.multiply(new BigDecimal("0.1"));
    }
}
