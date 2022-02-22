package br.com.rh.model;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.time.LocalDate;

import br.com.rh.ValidationException;

public class Employee {

	private String name;
	private String document;
	private Position position;
	private BigDecimal salary;
	private LocalDate dateLastReadjustment;

	public Employee(String nome, String cpf, Position cargo, BigDecimal salario) {
		this.name = nome;
		this.document = cpf;
		this.position = cargo;
		this.salary = salario;
	}

	public void readjustSalary(BigDecimal increase) {
		BigDecimal readjustmentPercentage = increase.divide(salary, RoundingMode.HALF_UP);
		if (readjustmentPercentage.compareTo(new BigDecimal("0.4")) > 0) {
			throw new ValidationException("Readjustment cannot exceed 40% of salary!");
		}
		this.salary = this.salary.add(increase);
		this.dateLastReadjustment = LocalDate.now();
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

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
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
