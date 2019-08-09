package com.learn.java.numeric.stream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxingExample {

	public static List<Integer> boxing() {
		return IntStream.rangeClosed(1, 10)
				// int
				.boxed()
				// Integer
				.collect(Collectors.toList());
	}

	public static int unboxing(List<Integer> integerList) {
		return integerList.stream().mapToInt(Integer::intValue).sum();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> integerList = boxing();
		System.out.println("Boxing : " + boxing());
		System.out.println("Unboxing : " + unboxing(integerList));
	}

}
