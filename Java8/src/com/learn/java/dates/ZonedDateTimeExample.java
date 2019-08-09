package com.learn.java.dates;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class ZonedDateTimeExample {

	public static void main(String[] args) {

		ZonedDateTime zonedDateTime = ZonedDateTime.now();
		System.out.println("zonedDateTime : " + zonedDateTime);

		System.out.println(zonedDateTime.getOffset());
		System.out.println(zonedDateTime.getZone());

		// ZoneId.getAvailableZoneIds()
		// .forEach((zone) -> System.out.println(zone));
		System.out.println(ZoneId.getAvailableZoneIds().size());

		System.out.println(
				"calcutta : " + ZonedDateTime.now(ZoneId.of("Asia/Calcutta")));

		LocalDateTime localDateTime = LocalDateTime
				.now(ZoneId.of("Asia/Calcutta"));
		System.out.println("localDateTime " + localDateTime);

		// convert localdatetime to zonedatetime
		LocalDateTime localDateTime2 = LocalDateTime.now();
		ZonedDateTime zonedDateTime2 = localDateTime2
				.atZone(ZoneId.of("America/Denver"));
		System.out.println("zonedDateTime2 " + zonedDateTime2);

	}

}
