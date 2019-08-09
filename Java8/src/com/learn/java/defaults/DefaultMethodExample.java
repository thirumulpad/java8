package com.learn.java.defaults;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class DefaultMethodExample {

	public static void main(String[] args) {
		List<String> nameList = StudentDatabase.getAllStudents().stream()
				.map(Student::getName).collect(Collectors.toList());

		// prior to java 8
		// Collections.sort(nameList);
		System.out.println("Sorted list using collections.sort : " + nameList);

		// java 8
		nameList.sort(Comparator.reverseOrder());
		System.out.println("Natural oder : " + nameList);

	}

}
