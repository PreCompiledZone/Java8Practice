package com.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

/**
 * 
 * @author amol
 *
 *         java.util.stream has been added in Java 8 to perform
 *         filter/map/reduce like operations with the collection. Stream API
 *         will allow sequential as well as parallel execution.
 * 
 * 
 *
 */
public class StramAPIExample {

	public static void main(String[] args) {

		List<Integer> myList = new ArrayList<>();

		for (int i = 0; i < 100; i++)
			myList.add(i);

		// sequential stream
		System.out.println("Sequential stream API");
		Stream<Integer> highNumber = myList.stream().filter(e -> e > 90);

		// calling println() method using method reference
		highNumber.forEach(System.out::println);
		
		// paraller stream
		System.out.println("Paraller stream API");
		Stream<Integer> lowNumber = myList.parallelStream().filter(e-> e<10);
		lowNumber.forEach(System.out::println);
		

	}

}
