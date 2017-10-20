package com.aditya.java8turtorial.Unit1Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class UnitExcerciseSolutionJava8 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aditya", "Abbaraju", 20),
				new Person("Teja", "Abbaraju", 25),
				new Person("Sita", "Ram", 80),
				new Person("Rama", "Krishna", 50)
				);
		
		//Step 1 : Sort list by LN
		Collections.sort(people, (p1, p2) -> p1.getLastName().compareTo(p2.getLastName()));

		//Create method that prints all elements in the list without predicate funcational interface 
		printAllWithLastNameA(people, p -> true);
		
		//Create method that prints all elements in the list
		printAllWithLastNameWithPredicate(people, p -> true);
		
		//Create method that prints all people in the list with LN A
		printAllWithLastNameWithPredicate(people, p -> p.getLastName().startsWith("A"));
	}
	
	private static void printAllWithLastNameA(List<Person> people , Condition c){
		for(Person p : people){
			if(c.test(p))
			System.out.println(p);
		} 
	}
	
	//JAva 8 created few interfaces which we can use in which predicate in one fuctional interface which has one abstract method which returns boolean. 
	private static void printAllWithLastNameWithPredicate(List<Person> people , Predicate<Person> pre){
		for(Person p : people){
			if(pre.test(p))
			System.out.println(p);
		} 
	}

}

