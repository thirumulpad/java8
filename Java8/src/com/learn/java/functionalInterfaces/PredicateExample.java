package com.learn.java.functionalInterfaces;

import java.util.function.Predicate;

public class PredicateExample {

	static Predicate<Integer> p1 = (int2) -> int2 % 2 == 0;
	static Predicate<Integer> p2 = (int2) -> int2 % 5 == 0;

	public static void main(String[] args) {

		predicateAnd();
		predicateOr();
		predicateNegate();
	}

	public static void predicateAnd() {
		System.out.println("Predicate And : " + p1.and(p2).test(10));
	}

	public static void predicateOr() {
		System.out.println("Predicate Or : " + p1.or(p2).test(8));
	}

	public static void predicateNegate() {
		System.out.println("Predicate Negate : " + p1.and(p2).negate().test(9));
	}
}
