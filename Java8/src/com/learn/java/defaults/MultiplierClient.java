package com.learn.java.defaults;

import java.util.Arrays;
import java.util.List;

public class MultiplierClient {

	public static void main(String[] args) {

		Multiplier multiplier = new MultiplierImpl();
		List<Integer> integers = Arrays.asList(1, 3, 5);

		System.out.println(
				"Result of multiplier : " + multiplier.multiply(integers));

		System.out.println(
				"Default size of multiplier : " + multiplier.size(integers));
	}

}
