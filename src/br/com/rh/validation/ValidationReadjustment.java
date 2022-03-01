package br.com.rh.validation;

import br.com.rh.model.Employee;

import java.math.BigDecimal;

public interface ValidationReadjustment {
    public void validate(Employee employee, BigDecimal increase);
}
