package com.aditya.java8turtorial.Unit1Example;

public class Lambda {

	public static void main(String[] args) {
		
		
		Lambda lam = new Lambda();
		lam.greet();

	}
	
	public void greet() {
		LambdaInterface inlineExpression = () -> System.out.print("LAMBDA EXPRESSION");
		inlineExpression.greet();
		
	}

}
