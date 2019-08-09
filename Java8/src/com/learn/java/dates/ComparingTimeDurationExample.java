package com.learn.java.dates;

import java.time.Duration;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class ComparingTimeDurationExample {

	public static void main(String[] args) {
		LocalTime localTime = LocalTime.of(7, 20);
		LocalTime localTime2 = LocalTime.of(8, 20);

		long difference = localTime.until(localTime2, ChronoUnit.MINUTES);
		System.out.println("diffe : " + difference);

		Duration duration = Duration.between(localTime, localTime2);
		System.out.println("to minutes : " + duration.toMinutes());

		Duration duration2 = Duration.ofMinutes(2);
		System.out.println("duration2 : " + duration2.toMinutes());

	}

}
