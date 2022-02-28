package br.com.rh.service;

import br.com.rh.ValidationException;
import br.com.rh.model.Employee;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

public class ReadjustmentService {
    public void readjustEmployeeSalary(Employee employee, BigDecimal increase) {

        final var currentWage = employee.getSalary();
        final var readjustmentPercentage = increase.divide(currentWage, RoundingMode.HALF_UP);
        if (readjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
            throw new ValidationException("Readjustment cannot exceed 40% of salary!");
        }
        final var readjustSalary = currentWage.add(increase);
        employee.updateSalary(readjustSalary);
    }
}
