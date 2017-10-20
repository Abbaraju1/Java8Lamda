package com.aditya.java8turtorial.Unit3Example;

public class MethodReferenceExample1 {
	
	//This is just basics of Lamda expression for details 
	//please wait for the next course

	public static void main(String[] args) {

		Thread thread = new Thread(MethodReferenceExample1::printMessage);
		//MethodReferenceExample1::printMessage is exactly same as () -> printMessage()
		thread.start();
	}
	
	public static void printMessage() {
		System.out.println("");
		
	}

}
