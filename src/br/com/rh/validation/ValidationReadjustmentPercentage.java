package br.com.rh.validation;

import br.com.rh.exception.ValidationException;
import br.com.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ValidationReadjustmentPercentage implements ValidationReadjustment {
    @Override
    public void validate(Employee employee, BigDecimal increase) {
        final var currentWage = employee.getSalary();
        final var readjustmentPercentage = increase.divide(currentWage, RoundingMode.HALF_UP);
        if (readjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0)
            throw new ValidationException("Readjustment cannot exceed 40% of salary!");
    }
}
