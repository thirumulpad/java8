package com.learn.java.stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamMinMaxExample {

	public static int findMaxValue(List<Integer> integerList) {

		return integerList.stream().reduce(0, (a, b) -> a > b ? a : b);
	}

	public static Optional<Integer> findMaxValueOptional(
			List<Integer> integerList) {

		return integerList.stream().reduce((a, b) -> a > b ? a : b);
	}

	public static Optional<Integer> findMinValueOptional(
			List<Integer> integerList) {

		return integerList.stream().reduce((a, b) -> a < b ? a : b);
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9,
				10);

		System.out.println(findMaxValue(integerList));

		System.out.println(findMaxValueOptional(new ArrayList<Integer>()));
		System.out.println(findMinValueOptional(integerList).get());
	}

}
