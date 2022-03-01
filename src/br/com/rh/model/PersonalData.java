package br.com.rh.model;

import java.math.BigDecimal;

public class PersonalData {
    private String name;
    private String document;
    private EmployeePosition employeePosition;
    private BigDecimal salary;

    public PersonalData(String name, String document, EmployeePosition employeePosition, BigDecimal salary) {
        this.name = name;
        this.document = document;
        this.employeePosition = employeePosition;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public EmployeePosition getEmployeePosition() {
        return employeePosition;
    }

    public void setEmployeePosition(EmployeePosition employeePosition) {
        this.employeePosition = employeePosition;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }
}
