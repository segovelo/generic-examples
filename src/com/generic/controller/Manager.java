package com.generic.controller;

public class Manager extends Employee {
	protected Integer numberOfEmployee;

	public Manager(String name, Integer age, String department, String salary, Integer service,
			Integer numberOfEmployee) {
		super(name, age, department, salary, service);
		this.numberOfEmployee = numberOfEmployee;
	}

	public Integer getNumberOfEmployee() {
		return numberOfEmployee;
	}

	public void setNumberOfEmployee(Integer numberOfEmployee) {
		this.numberOfEmployee = numberOfEmployee;
	}
    public String getName() {
    	return this.name;
    }
	@Override
	public String toString() {
		return "Manager [numberOfEmployee=" + numberOfEmployee + ", department=" + department + ", salary=" + salary
				+ ", service=" + service + ", id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	

}
