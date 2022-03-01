package br.com.rh.validation;

import br.com.rh.exception.ValidationException;
import br.com.rh.model.Employee;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class ValidationPeriodicityBetweenReadjustment implements ValidationReadjustment {
    @Override
    public void validate(Employee employee, BigDecimal increase) {
        final var dateLastReadjustment = employee.getDateLastReadjustment();
        final var actualDate = LocalDate.now();
        final var numberOfMonthsOfTheLastReadjustment = ChronoUnit.MONTHS.between(dateLastReadjustment, actualDate);
        if (numberOfMonthsOfTheLastReadjustment < 6)
            throw new ValidationException("Interval between readjustments must be at least six months!");
    }
}
