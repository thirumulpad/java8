package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalTimeDateExample {

	public static void main(String[] args) {
		LocalDateTime dateTime = LocalDateTime.now();
		System.out.println("dateTime " + dateTime);
		LocalDateTime dateTime2 = dateTime.of(LocalDate.of(2019, 9, 13),
				LocalTime.of(03, 45));
		System.out.println("dateTime2 " + dateTime2);

		// getting the values
		System.out.println("hour : " + dateTime.getHour());
		System.out.println("minute : " + dateTime.getMinute());
		System.out.println("day : " + dateTime.getDayOfMonth());

		// modify
		System.out.println("plus hours" + dateTime.plusHours(2));
		System.out.println("minus days" + dateTime.minusDays(2));

		// converting local date and local time to localDateTime and vice versa
		LocalDate date = LocalDate.of(2019, 3, 27);
		System.out.println(date.atTime(LocalTime.MIDNIGHT));
		LocalTime time = LocalTime.of(3, 33);
		System.out.println(date.atTime(time));

		System.out.println(time.atDate(date));

		LocalDateTime dateTime3 = time.atDate(date);
		System.out.println(dateTime3.toLocalDate());
		System.out.println(dateTime3.toLocalTime());

	}

}
