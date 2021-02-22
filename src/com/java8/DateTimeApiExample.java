package com.java8;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;

/**
 * 
 * @author amol
 *
 *         All the classes in the new Date Time API are immutable All the
 *         classes use Factory Pattern and Strategy Pattern for better handling
 * 
 *         All the new Date Time API classes comes with methods to perform
 *         common tasks, such as plus, minus, format, parsing, getting separate
 *         part in date/time etc.
 * 
 *         The new Date Time API works on ISO-8601 calendar system but we can
 *         use it with other non ISO calendars as well.
 *
 */
public class DateTimeApiExample {

	public static void main(String[] args) {

		// LocalDate

		// LocalDate is an immutable class that represents Date with default format of
		// yyyy-MM-dd. We can use now() method to get the current date.
		LocalDate today = LocalDate.now();
		System.out.println("Current date using LocalDate : " + today);
		
		// 10 days after today
		LocalDate nextDate = LocalDate.now().plusDays(10);
		System.out.println("10th days date after today : " + nextDate);
		
		// 10 days after today
		LocalDate prevDate = LocalDate.now().minusDays(10);
		System.out.println("10th days date before today : " + prevDate);

		// Current date in "Asia/Kolkata", you can get it from ZoneId javadoc
		LocalDate todayKolkata = LocalDate.now(ZoneId.of("Asia/Kolkata"));
		System.out.println("Current Date in IST = " + todayKolkata);

		// LocalTime

		// LocalTime is an immutable class whose instance represents a time in the human
		// readable format. It’s default format is hh:mm:ss.zzz
		LocalTime time = LocalTime.now();
		System.out.println("Current time " + time);

		// LocalDateTime

		// LocalDateTime is an immutable date-time object that represents a date-time,
		// with default format as yyyy-MM-dd-HH-mm-ss.zzz.
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("Current local date time : " + dateTime);

		// Date time in machine readable format
		// Instant class is used to work with machine readable time format, it stores
		// date time in unix timestamp.
		Instant currentDateTime = Instant.now();
		System.out.println("Current date time in machine readable format: " + currentDateTime);

	}
}
