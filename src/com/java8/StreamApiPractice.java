package com.java8;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author amol
 *
 *         A stream pipeline consists of a source, followed by zero or more
 *         intermediate operations and a terminal operation;
 *
 *         Source -> Filter -> Sort -> Map -> Collect
 */
public class StreamApiPractice {

	public static void main(String[] args) {

		// 1. Integer stream
		System.out.println("Integer stream");
		IntStream.range(0, 10).forEach(e -> System.out.print(" " + e));

		// 2. Integer stream with skip
		System.out.println("\nInteger stream with skip");
		IntStream.range(0, 10).skip(5).forEach(e -> System.out.print(" " + e));

		// 3. Integer stream with sum
		System.out.println("\nInteger stream with sum - " + IntStream.range(0, 10).sum());

		// 4. Stream.of , sorted, findFirst
		System.out.println("Stream.of , sorted , findFirst");
		Stream.of("amol", "ram", "Nilwarn", "Example", "name").filter(e -> e.startsWith("N")).sorted()
				.forEach(e -> System.out.println(" " + e));

		// 5. average of squares of an int array
		System.out.println("\naverage of squares of an int array - ");
		Arrays.stream(new int[] { 2, 4, 6, 8, 3, 7, 1, 3, 2 }).map(x -> x * x).average().ifPresent(System.out::print);

		// 6. Stream from list, filter, print
		System.out.println("\nStream from list, filter, print");
		List<String> list = Arrays.asList("Amol", "Nilwarn", "Ritesh", "Ram", "Gem", "Legend");
		list.stream().map(e -> e.toLowerCase()).filter(e -> e.startsWith("r")).forEach(e -> System.out.print(" " + e));

		// 7. Reduction - sum
		System.out.println("\nSum of Integer using reduce() - "+IntStream.of(5,2,1).reduce(0, (int a,int b) -> a+b));
		
		// 8. Reduction - SummaryStatistics
		IntSummaryStatistics summary = IntStream.of(5,5,1,7,6,3,2,5,9,10,1,3,4).summaryStatistics();
		System.out.println("\nSummary statistics - "+summary);
	}

}
