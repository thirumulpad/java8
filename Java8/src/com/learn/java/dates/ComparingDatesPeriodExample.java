package com.learn.java.dates;

import java.time.LocalDate;
import java.time.Period;

public class ComparingDatesPeriodExample {

	public static void main(String[] args) {

		LocalDate date1 = LocalDate.now();
		LocalDate date2 = LocalDate.ofYearDay(2019, 365);
		Period period = date1.until(date2);

		System.out.println("get days : " + period.getDays());
		System.out.println("getMonths : " + period.getMonths());
		System.out.println("getYears : " + period.getYears());

		Period period2 = Period.ofDays(30);
		System.out.println("getDays : " + period2.getDays());

		Period period3 = Period.ofYears(10);
		System.out.println("toTotalMonths : " + period3.toTotalMonths());

		Period period4 = Period.between(date1, date2);
		System.out.println(period4.getDays() + ": " + period4.getMonths()
				+ " : " + period4.getYears());
	}

}
