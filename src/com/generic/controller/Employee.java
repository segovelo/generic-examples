package com.generic.controller;

public class Employee extends Person {
	protected String department;
	protected  String salary;
	protected Integer service;
	
	public Employee(String name, Integer age, String department, String salary, Integer service) {
		super(name, age);
		this.department = department;
		this.salary = salary;
		this.service = service;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String salary) {
		this.salary = salary;
	}

	public Integer getService() {
		return service;
	}

	public void setService(Integer service) {
		this.service = service;
	}

	@Override
	public String toString() {
		return "Employee [department=" + department + ", salary=" + salary + ", service=" + service + ", id=" + id
				+ ", name=" + name + ", age=" + age + "]";
	}
	
	

}
