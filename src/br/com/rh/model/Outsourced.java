package br.com.rh.model;

import java.math.BigDecimal;

public class Outsourced {
    private PersonalData personalData;
    private String company;

    public Outsourced(String name, String document, EmployeePosition employeePosition, BigDecimal salary) {
        this.personalData = new PersonalData(name, document, employeePosition, salary);
        this.company = company;
    }

    public PersonalData getPersonalData() {
        return personalData;
    }

    public void setPersonalData(PersonalData personalData) {
        this.personalData = personalData;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }
}
