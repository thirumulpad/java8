package com.learn.java.lambdas;

import java.util.Comparator;

public class ComparatorLambdaExample {

	public static void main(String[] args) {

		Comparator comparator = new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1.compareTo(o2);
			}
		};

		System.out.println("resutl is : " + comparator.compare(1, 2));

		Comparator<Integer> comparatorLambda = (Integer o1, Integer o2) -> o1.compareTo(o2);
		System.out.println("result is : " + comparatorLambda.compare(3, 1));

	}

}
