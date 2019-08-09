package com.learn.java.methodreference;

import java.util.function.Function;

public class FunctionMethodReferenceExample {

	static Function<String, String> toUpperCaseMethodReferance = String::toUpperCase;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(toUpperCaseMethodReferance.apply("hello world"));
	}

}
