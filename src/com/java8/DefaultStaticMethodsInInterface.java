package com.java8;

/**
 * 
 * @author amol
 *
 *         Use default and static keyword to create interfaces with method
 *         implementation.
 * 
 *         you can access the default methods of an interface using the objects
 *         of the implementing classes. If you want, you can override a default
 *         method of an interface from the implementing class.
 * 
 *         You can call a static method using the name of an interface.
 *
 */
public class DefaultStaticMethodsInInterface {

	public static void main(String[] args) {
		MyInterfaceImpl obj = new MyInterfaceImpl();

		obj.printDefaultMethod();
		obj.print();

		// accessing static method
		MyInterface.printStaticMethod();
	}

}

class MyInterfaceImpl implements MyInterface {

	@Override
	public void print() {
		System.out.println("Printed using non default method with implementation");
	}

}

interface MyInterface {

	public void print();

	public default void printDefaultMethod() {
		System.out.println("Printed using default method");
	}

	public static void printStaticMethod() {
		System.out.println("Printed using static method");
	}

}
