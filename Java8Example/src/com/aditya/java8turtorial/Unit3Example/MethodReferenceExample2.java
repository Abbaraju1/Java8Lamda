package com.aditya.java8turtorial.Unit3Example;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.aditya.java8turtorial.Unit1Example.Person;

public class MethodReferenceExample2 {

	public static void main(String[] args) {
		List<Person> people = Arrays.asList(
				new Person("Aditya", "Abbaraju", 20),
				new Person("Teja", "Abbaraju", 25),
				new Person("Sita", "Ram", 80),
				new Person("Rama", "Krishna", 50)
				);
		
		// (p) -> method(p) is same as cosumer function where the complier knows what is the input agument
		performConditionally(people, p -> true, System.out::println);
		
	}
	
	//JAva 8 created few interfaces which we can use in which predicate in one fuctional interface which has one abstract method which returns boolean. 
	private static void performConditionally(List<Person> people , Predicate<Person> pre, Consumer<Person> con){
		for(Person p : people){
			if(pre.test(p))
				 con.accept(p);
		} 
	}

}
