package com.learn.java.dates;

import java.time.LocalTime;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class LocalTimeExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);
		LocalTime localTime2 = localTime.of(10, 10);
		System.out.println("localTime2 : " + localTime2);
		LocalTime localTime3 = localTime.of(10, 10, 35);
		System.out.println("localTime3 : " + localTime3);
		LocalTime localTime4 = localTime.of(10, 10, 35, 548);
		System.out.println("localTime4 : " + localTime4);

		// getting the values from local time instance
		System.out.println("localTime.getHour() : " + localTime.getHour());
		System.out.println("localTime.getMinute() : " + localTime.getMinute());
		System.out.println("ChronoField.CLOCK_HOUR_OF_DAY : "
				+ localTime.get(ChronoField.CLOCK_HOUR_OF_DAY));
		System.out.println("toSecondOfDay : " + localTime.toSecondOfDay());

		// modify the time
		System.out.println("minusHours : " + localTime.minusHours(2));
		System.out.println("plus using chrono unit: "
				+ localTime.plus(1, ChronoUnit.HOURS));
		System.out.println("with : " + localTime.MIDNIGHT);
		System.out.println("with chrono field: "
				+ localTime.with(ChronoField.HOUR_OF_DAY, 22));
		System.out.println("with : " + localTime.plus(2, ChronoUnit.MINUTES));
	}

}
