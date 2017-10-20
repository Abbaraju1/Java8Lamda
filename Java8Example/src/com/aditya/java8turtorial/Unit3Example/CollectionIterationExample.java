package com.aditya.java8turtorial.Unit3Example;

import java.util.Arrays;
import java.util.List;

import com.aditya.java8turtorial.Unit1Example.Person;

public class CollectionIterationExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aditya", "Abbaraju", 20),
				new Person("Teja", "Abbaraju", 25),
				new Person("Sita", "Ram", 80),
				new Person("Rama", "Krishna", 50)
				);
		System.out.println("USING FOR LOOP");
		for(int i = 0 ; i<people.size(); i++){
			System.out.println(people.get(i));
		}
		
		System.out.println("USING FOR EACH LOOP");
		for(Person p : people){
			System.out.println(p);
		}
		
		System.out.println("USING FOR EACH - LAMBDA LOOP");
		people.forEach(System.out::println);
		// or people.forEach(p -> System.out.println(p)); is the same
	}

}
