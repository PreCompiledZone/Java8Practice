package com.java8;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author amol
 *
 *         Java 8 has introduced forEach method in java.lang.Iterable interface.
 *
 */
public class ForEachExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("amol");
		list.add("Abcd");
		list.add("xysdf");
		list.add("sample");
		list.add("Example");
		
		list.forEach(
					e->{
						System.out.println(e.charAt(0));
					}
				);
		
	}
}
