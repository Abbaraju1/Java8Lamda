package com.aditya.java8turtorial.Unit3Example;

import java.util.Arrays;
import java.util.List;

import com.aditya.java8turtorial.Unit1Example.Person;

public class StreamsExample {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aditya", "Abbaraju", 20),
				new Person("Teja", "Abbaraju", 25),
				new Person("Sita", "Ram", 80),
				new Person("Rama", "Krishna", 50)
				);
		
		people.stream()
		.filter(p -> p.getLastName().startsWith("A"))
		.forEach(System.out::println);

		long count = people.stream()
		.filter(p -> p.getLastName().startsWith("A"))
		.count();
		System.out.println(count);
		
		// parallel stream is just the same as stream but if the compiler 
		// feels if it breaks down into 2 parallel streams and the job is done eaisly it will do
		long count1 = people.parallelStream() 
		.filter(p -> p.getLastName().startsWith("A"))
		.count();
		System.out.println(count1);
	}

}
