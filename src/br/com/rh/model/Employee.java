package br.com.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.rh.ValidationException;

public class Employee {

	private String name;
	private String document;
	private EmployeePosition employeePosition;
	private BigDecimal salary;
	private LocalDate dateLastReadjustment;

	public Employee(String nome, String cpf, EmployeePosition cargo, BigDecimal salario) {
		this.name = nome;
		this.document = cpf;
		this.employeePosition = cargo;
		this.salary = salario;
	}

	public void updateSalary(BigDecimal newSalary) {
		this.salary = newSalary;
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

	public LocalDate getDateLastReadjustment() {
		return dateLastReadjustment;
	}

	public void setDateLastReadjustment(LocalDate dateLastReadjustment) {
		this.dateLastReadjustment = dateLastReadjustment;
	}

}
