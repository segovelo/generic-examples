package com.generic.controller;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertThat;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

import org.junit.Test;

public class GenericExamplesController {

	public static void main(String[] args) {
		Person[] persons = new Person[2];
		persons[0] = new Person("Julian", 32);
		persons[1] = new Person("Marelle", 25);
		List<Person> personList = fromArrayToList(persons);
		System.out.println("From Array of Persons to List : " + personList.toString());
		System.out.println("Person List toString using Lower Bound Manager Class : " + objectToString(personList));
		
		Employee[] employees = new Employee[2];
		employees[0] = new Employee("Daniel", 39, "Health & Safety", "28,000", 4);
		employees[1] = new Employee("Juliette", 42, "Accountancy", "40,000", 16);
		List<Employee> employeeList = fromArrayToList(employees);
		System.out.println("From Array of Employees to List : " + employeeList.toString());
		
		Manager[] managers = new Manager[2];
		managers[0] = new Manager("Stuart", 52, "Strategy", "50,000", 24, 35);
		managers[1] = new Manager("Matthew", 46, "Business", "45,000", 18, 23);
		List<Employee> managerList = fromArrayToList(managers);
		System.out.println("From Array of Managers to List : " + managerList.toString());
		System.out.println("From Person::convertAge() to Managers List :"+ convertAge(managerList));
		System.out.println("Manager List convertAge using Upper Bound Person Class : " + convertAge(managerList));
		
		givenArrayOfIntegers_thenListOfStringReturnedOK();
				
	}
		
	
	public static <T> List<T> fromArrayToList(T[] a) {   
	    return Arrays.stream(a).collect(Collectors.toList());
	}
	
	public static <T, G> List<G> fromArrayToList(T[] a, Function<T, G> mapperFunction) {
	    return Arrays.stream(a)
	      .map(mapperFunction)
	      .collect(Collectors.toList());
	}

	
	public static List<String> convertAge(List<? extends Person> persons) {
		return persons.stream()
				.map(Person::convertAge)
				.collect(Collectors.toList());
	}
	
	public static List<? super Manager> retrieveGeneric(List<? super Manager> managers){
		return managers;
	}
	
	public static List<String> objectToString(List<? super Manager> managers){	
		return managers.stream()
						.map(manager -> manager.toString())
						.collect(Collectors.toList());
	}
	
	@Test
	public static void givenArrayOfIntegers_thenListOfStringReturnedOK() {
	    Integer[] intArray = {1, 2, 3, 4, 5};
	    List<String> stringList
	      = fromArrayToList(intArray, Object::toString);
	 
	    assertThat(stringList, hasItems("1", "2", "3", "4", "5"));
	}



}
