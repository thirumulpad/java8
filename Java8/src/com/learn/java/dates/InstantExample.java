package com.learn.java.dates;

import java.time.Instant;

public class InstantExample {

	public static void main(String[] args) {
		Instant instant = Instant.now();
		System.out.println(instant);
		// jan 1 1970 -> EPOCH-> 86400
		System.out.println(instant.getEpochSecond());
		System.out.println(instant.ofEpochSecond(0));
		System.out.println(instant.getNano());
	}

}
