package com.learn.java.parallelstream;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class ParallelStreamBoxedExample {

	public static int sequentialSum(List<Integer> integers) {
		long starttime = System.currentTimeMillis();
		int sum = integers.stream().reduce(0, (x, y) -> x + y);
		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println("Sequentially time taken : " + totaltime);
		return sum;
	}

	public static int parallelSum(List<Integer> integers) {
		
//		unboxing from Integer to int
		long starttime = System.currentTimeMillis();
		int sum = integers.parallelStream().reduce(0, (x, y) -> x + y);
		long endtime = System.currentTimeMillis();
		long totaltime = endtime - starttime;
		System.out.println("Parallel time taken : " + totaltime);
		return sum;
	}

	public static void main(String[] args) {
		List<Integer> integerList = IntStream.rangeClosed(0, 10000).boxed()
				.collect(Collectors.toList());
		sequentialSum(integerList);
		parallelSum(integerList);
	}

}
