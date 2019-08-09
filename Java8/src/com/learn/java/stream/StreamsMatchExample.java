package com.learn.java.stream;

import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsMatchExample {

	private static final Predicate<Student> allMatchPredicate = student -> student
			.getGpa() >= 3.9;
	private static final Predicate<Student> anyMatchPredicate = student -> student
			.getGpa() >= 4.0;
	private static final Predicate<Student> noneMatchPredicate = student -> student
			.getGpa() >= 5;

	public static boolean allMatch() {
		return StudentDatabase.getAllStudents().stream()
				.allMatch(allMatchPredicate);
	}

	public static boolean anyMatch() {
		return StudentDatabase.getAllStudents().stream()
				.anyMatch(anyMatchPredicate);
	}

	public static boolean noneMatch() {
		return StudentDatabase.getAllStudents().stream()
				.noneMatch(noneMatchPredicate);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("result of all match : " + allMatch());
		System.out.println("result of any match : " + anyMatch());
		System.out.println("result of none match : " + noneMatch());
	}

}
