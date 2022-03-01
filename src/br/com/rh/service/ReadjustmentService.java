package br.com.rh.service;

import br.com.rh.model.Employee;
import br.com.rh.validation.ValidationReadjustment;

import java.math.BigDecimal;
import java.util.List;

public class ReadjustmentService {
    private final List<ValidationReadjustment> validationReadjustmentList;

    public ReadjustmentService(List<ValidationReadjustment> validationReadjustmentList) {
        this.validationReadjustmentList = validationReadjustmentList;
    }

    public void readjustEmployeeSalary(Employee employee, BigDecimal increase) {
        this.validationReadjustmentList.forEach(v -> v.validate(employee, increase));
        final var readjustSalary = employee.getSalary().add(increase);
        employee.updateSalary(readjustSalary);
    }
}
