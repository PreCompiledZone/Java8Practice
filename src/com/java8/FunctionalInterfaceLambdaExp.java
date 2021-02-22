package com.java8;

/**
 * 
 * @author amol
 *
 *         An interface with exactly one abstract method becomes Functional
 *         Interface.
 * 
 * @FunctionalInterface annotation is a facility to avoid accidental addition of
 *         abstract methods in the functional interfaces.
 * 
 *         java.lang.Runnable with single abstract method run() is
 *         a great example of functional interface.
 * 
 *         So lambda expressions are a means to create anonymous
 *         classes of functional interfaces easily.
 * 
 *
 */


interface MyFunctionalInterface {
	public void print();
}

public class FunctionalInterfaceLambdaExp {

	public static void main(String[] args) {
		
		// We can instantiate an interface with anonymous class but the code looks
		// bulky.
		MyFunctionalInterface obj = new MyFunctionalInterface() {

			@Override
			public void print() {
				// TODO Auto-generated method stub
				System.out.println("Printed using anonymous class");
			}
		};

		// Using lambda expression
		MyFunctionalInterface objLambda = () -> {
			System.out.println("Printed using Lambda expression");
		};
		
		// calling print method
		obj.print();
		objLambda.print();
		
	}

}
