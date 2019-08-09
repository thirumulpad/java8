package com.learn.java.imperativevsdeclarative;

import java.util.stream.IntStream;

public class ImperativeVsDeclarativeExample1 {

	public static void main(String[] args) {

//		imperative style
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		System.out.println(sum);

//		declarative style - what style of programming
		int sum2 = IntStream.rangeClosed(0, 100).sum();
		System.out.println(sum2);
	}
}
