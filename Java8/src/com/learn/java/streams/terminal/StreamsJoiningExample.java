package com.learn.java.streams.terminal;

import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsJoiningExample {

	public static String joinNamesNoDelimiter() {

		return StudentDatabase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining());
	}

	public static String joinNamesDelimiter() {

		return StudentDatabase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining("-"));
	}

	public static String joinNamesPrefixAndSuffix() {

		return StudentDatabase.getAllStudents().stream().map(Student::getName)
				.collect(Collectors.joining(" ", "(", ")"));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Joining names 1 : " + joinNamesNoDelimiter());
		System.out.println(
				"Joining names with delimiters : " + joinNamesDelimiter());
		System.out.println("Joining names with delimiters, prefix and suffix : "
				+ joinNamesPrefixAndSuffix());
	}

}
