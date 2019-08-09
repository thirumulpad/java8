package com.learn.java.numeric.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class NumericStreamExample {

	public static int sumOfNumberIntStream(List<Integer> list) {
		return IntStream.rangeClosed(1, 6).sum();
	}

	public static void main(String[] args) {

		List<Integer> integerlist = Arrays.asList(1, 2, 3, 4, 5, 6);
		System.out.println(sumOfNumberIntStream(integerlist));
	}
}
