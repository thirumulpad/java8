package com.learn.java.stream;

import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamReduceExample {

	public static Optional<Student> getHighestGpaStudent() {
		return StudentDatabase.getAllStudents().stream()
				.reduce((s1, s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);

	}
	public static void main(String[] args) {
		System.out.println(getHighestGpaStudent().get());
	}

}
