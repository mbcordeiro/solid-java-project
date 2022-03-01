package br.com.rh.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Employee {

    private final PersonalData personalData;
    private LocalDate dateLastReadjustment;

    public Employee(String name, String document, EmployeePosition employeePosition, BigDecimal salary, LocalDate dateLastReadjustment) {
        this.personalData = new PersonalData(name, document, employeePosition, salary);
        this.dateLastReadjustment = dateLastReadjustment;
    }

    public void updateSalary(BigDecimal newSalary) {
        this.personalData.setSalary(newSalary);
        this.dateLastReadjustment = LocalDate.now();
    }

    public void promote(EmployeePosition newEmployeePosition) {
        this.personalData.setEmployeePosition(newEmployeePosition);
    }

    public EmployeePosition getEmployeePosition() {
        return this.personalData.getEmployeePosition();
    }

    public BigDecimal getSalary() {
        return this.personalData.getSalary();
    }

    public LocalDate getDateLastReadjustment() {
        return dateLastReadjustment;
    }

    public void setDateLastReadjustment(LocalDate dateLastReadjustment) {
        this.dateLastReadjustment = dateLastReadjustment;
    }
}
