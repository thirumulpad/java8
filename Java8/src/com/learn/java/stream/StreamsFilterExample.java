package com.learn.java.stream;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsFilterExample {

	private static final Predicate<Student> filterGenderPredicate = (
			student) -> student.getGender().equals("female");

	public static List<Student> filterStudents() {
		return StudentDatabase.getAllStudents().stream()
				.filter(filterGenderPredicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
