package com.learn.java.imperativevsdeclarative;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ImperativeVsDeclarativeEg2 {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(0, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 5, 6, 6, 7, 7, 8, 9, 10);

//		imperative approach
		List<Integer> uniqueList = new ArrayList<>();
		for (Integer integer : list) {
			if (!uniqueList.contains(integer)) {
				uniqueList.add(integer);
			}
		}
		System.out.println(uniqueList);
		

//		declarative approach
		uniqueList = list.stream().distinct().collect(Collectors.toList());
		System.out.println(uniqueList);
	}

}
