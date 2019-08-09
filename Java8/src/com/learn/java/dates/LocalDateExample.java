package com.learn.java.dates;

import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;

public class LocalDateExample {

	public static void main(String[] args) {
		LocalDate date = LocalDate.now();
		System.out.println("date : " + date);

		LocalDate date2 = LocalDate.of(2019, 8, 10);
		System.out.println("date2 : " + date2);

		LocalDate date3 = LocalDate.ofYearDay(2019, 240);
		System.out.println("date2 : " + date3);

		System.out.println(date.get(ChronoField.DAY_OF_MONTH));

		// modifying local date
		System.out.println("plus days : " + date.plusDays(7));
		System.out.println("plus months : " + date.plusMonths(7));
		System.out.println("minus days : " + date.minusDays(7));
		System.out.println("with year : " + date.withYear(2027));
		System.out.println(
				"with chronofield : " + date.with(ChronoField.YEAR, 2050));
		System.out.println("with temporal adjusters : "
				+ date.with(TemporalAdjusters.firstDayOfYear()));
		System.out.println(
				"with chrono unit enum : " + date.minus(2, ChronoUnit.YEARS));

		// additional support methods
		System.out.println("is leap year : " + date.plusYears(1).isLeapYear());
		System.out.println("is date same : " + date.plusDays(2).isEqual(date2));
		System.out.println("is date before: " + date.isBefore(date2));
		System.out.println("is date after : " + date.isAfter(date2));

		// unsupported scenarios
		System.out.println(
				"with chrono unit enum : " + date.minus(2, ChronoUnit.MINUTES));
		
	}

}
