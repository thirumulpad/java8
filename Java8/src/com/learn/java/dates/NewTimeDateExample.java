package com.learn.java.dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class NewTimeDateExample {

	public static void main(String[] args) {
		// Local Date
		LocalDate localDate = LocalDate.now();
		System.out.println("localDate : " + localDate);

		// Local TIme
		LocalTime localTime = LocalTime.now();
		System.out.println("localTime : " + localTime);

		// Local TIme
		LocalDateTime localDateTime = LocalDateTime.now();
		System.out.println("localDateTime : " + localDateTime);
	}

}
