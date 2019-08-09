package com.learn.java.streams.terminal;

import java.util.stream.Collectors;

import com.learn.java.data.StudentDatabase;

public class StreamsCountingExample {

	public static Long count() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.counting());
	}

	public static Long countStudentsWithGPA() {
		return StudentDatabase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9)
				.collect(Collectors.counting());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Counting : " + count());
		System.out.println("countStudentsWithGPA : " + countStudentsWithGPA());

	}

}
