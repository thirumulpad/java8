package com.learn.java.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CollectionsVsStreams {

	public static void main(String[] args) {

		List<String> names = new ArrayList<String>();
		names.add("James");
		names.add("Jim");
		names.add("Jenny");

		names.remove(0);

		Stream<String> nameStream = names.stream();
		nameStream.forEach((string) -> System.out.println(string));
	}

}
