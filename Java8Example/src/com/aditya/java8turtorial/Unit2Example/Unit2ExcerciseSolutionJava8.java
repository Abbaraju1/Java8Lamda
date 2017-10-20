package com.aditya.java8turtorial.Unit2Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.aditya.java8turtorial.Unit1Example.Person;

public class Unit2ExcerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aditya", "Abbaraju", 20),
				new Person("Teja", "Abbaraju", 25),
				new Person("Sita", "Ram", 80),
				new Person("Rama", "Krishna", 50)
				);
		
		//Step 1 : Sort list by LN
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		//Create method that prints all elements in the list
		performConditionally(people, p -> true, p -> System.out.println(p));
		
		//Create method that prints all people in the list with LN A
		performConditionally(people, p -> p.getLastName().startsWith("A"), p -> System.out.println(p));
		
		//Create method that prints all people in the list with FN A
				performConditionally(people, p -> p.getLastName().startsWith("A"), p -> System.out.println(p.getFirstName()));
	}
	
	//JAva 8 created few interfaces which we can use in which predicate in one fuctional interface which has one abstract method which returns boolean. 
	private static void performConditionally(List<Person> people , Predicate<Person> pre, Consumer<Person> con){
		for(Person p : people){
			if(pre.test(p))
				 con.accept(p);
		} 
	}

}

