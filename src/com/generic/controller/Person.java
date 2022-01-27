package com.generic.controller;

import java.util.UUID;

public class Person {

	protected String id;
	protected String name;
	protected Integer age;
	
	
	public Person(String name, Integer age) {
		super();
		this.id = UUID.randomUUID().toString();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
	
	public String convertAge() {
		return age.toString();
	}
}
