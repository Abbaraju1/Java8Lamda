package com.aditya.java8turtorial.Unit2Example;

import java.util.function.BiConsumer;

public class ExceptionHandlingForLambdaExample {

	public static void main(String[] args) {
		int[] i = { 1,2,3,4};
		int key = 0;
		
		process(i , key, wrapperLambda((v, k) -> System.out.println(v/k))) ;
	}
	
	private static void process(int[] i, int key, BiConsumer<Integer, Integer> biconsumer) {
		for(int j : i){
			biconsumer.accept(j, key);
		} 		
	}
	
	private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biconsumer) {
		return (v,k) -> {
			try{
				biconsumer.accept(v,k);
			}catch (ArithmeticException e) {
				System.out.println("Exception Happened in Wrapper Lambda");
			}
		};
	}

}

