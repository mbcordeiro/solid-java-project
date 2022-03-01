package br.com.rh.service.taxation;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Annual implements Readjustment {
    private final BigDecimal value;
    private final LocalDate date;

    public Annual(BigDecimal value, LocalDate date) {
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
}
