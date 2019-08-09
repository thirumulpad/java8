package com.learn.java.parallelstream;

import java.util.function.Supplier;
import java.util.stream.IntStream;

public class ParallelStreamExample {

	public static int sumSequencialStream() {
		return IntStream.rangeClosed(1, 100000).sum();
	}
	public static int sumParallelStream() {
		return IntStream.rangeClosed(1, 100000).parallel().sum();
	}

	public static long checkPerformanceResult(Supplier<Integer> supplier,
			int noOfTimes) {
		long starttime = System.currentTimeMillis();
		for (int i = 0; i < noOfTimes; i++) {
			supplier.get();
		}
		long endTime = System.currentTimeMillis();
		return endTime - starttime;
	}

	public static void main(String[] args) {
		System.out.println(Runtime.getRuntime().availableProcessors());
		System.out.println(checkPerformanceResult(
				ParallelStreamExample::sumSequencialStream, 20));
		System.out.println(checkPerformanceResult(
				ParallelStreamExample::sumParallelStream, 20));
	}

}
