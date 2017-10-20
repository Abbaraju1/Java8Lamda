package com.aditya.java8turtorial.Unit1Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UnitExcerciseSolutionJava7 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aditya", "Abbaraju", 20),
				new Person("Teja", "Abbaraju", 25),
				new Person("Sita", "Ram", 80),
				new Person("Rama", "Krishna", 50)
				);
		
		//Step 1 : Sort list by LN
		
		Collections.sort(people, new Comparator<Person>(){

			@Override
			public int compare(Person o1, Person o2) {
				return o1.getLastName().compareTo(o2.getLastName());
			}
			
		});
		
		//Create method that prints all elements in the list
		printAll(people);
		
		//Create method that prints all people in the list with LN A
		printAllWithLastNameA(people, new Condition() {
			@Override
			public boolean test(Person p) {
				return p.getLastName().startsWith("A");
			}
		});
				

	}
	
	private static void printAll(List<Person> people){
		for(Person p : people){
			System.out.println(p);
		}
	}
	
	private static void printAllWithLastNameA(List<Person> people , Condition c){
		for(Person p : people){
			if(c.test(p))
			System.out.println(p);
		}
	}

}

interface Condition{
	boolean test(Person p);
}
