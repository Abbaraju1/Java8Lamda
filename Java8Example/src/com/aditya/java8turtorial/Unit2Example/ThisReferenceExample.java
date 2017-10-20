package com.aditya.java8turtorial.Unit2Example;

public class ThisReferenceExample {

	public void doProcess(int i , Process p){
		p.process(i);
	}
	
	public void execute(){
		//this == ?
		doProcess(10, i -> {
			System.out.println("Value of i : " +i);
			System.out.println(this); // this here is referenced to exactly what this is outside this method execute
		});
	}
	
	public static void main(String[] args) {
		ThisReferenceExample thisReferenceExample = new ThisReferenceExample();
		/*thisReferenceExample.doProcess(10, i -> {
			System.out.println("Value of i : " +i);
		});*/
		
		thisReferenceExample.execute();
	}
	
	public String toString() {
		return "This is the reference of ThisReferenceExample.class";
		
	}
}
