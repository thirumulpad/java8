package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Date;

public class DatetoLocalTimeDateExample {

	public static void main(String[] args) {

		// Java util date to local date and vice versa
		Date date = new Date();
		System.out.println("date " + date);
		LocalDate localdate = date.toInstant().atZone(ZoneId.systemDefault())
				.toLocalDate();
		System.out.println("localdate " + localdate);

		Date date2 = new Date().from(localdate.atTime(LocalTime.now())
				.atZone(ZoneId.systemDefault()).toInstant());
		System.out.println("date2 : "+date2);
		
		// Java sql date to local date and vice versa
		
	}

}
