package com.learn.java.stream;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class StreamLimitSkipExample {

	public static Optional<Integer> limit(List<Integer> integers) {
		return integers.stream().limit(2).reduce((x, y) -> x + y);
	}

	public static Optional<Integer> skip(List<Integer> integers) {
		return integers.stream().skip(3).reduce((x, y) -> x + y);
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(6, 7, 8, 9, 10);

		System.out.println(limit(integerList).get());
		System.out.println(skip(integerList).get());
	}

}
