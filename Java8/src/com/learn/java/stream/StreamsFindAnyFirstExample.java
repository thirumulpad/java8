package com.learn.java.stream;

import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsFindAnyFirstExample {

	public static Optional<Student> findAnyStudent() {
		return StudentDatabase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9).findAny();
	}

	public static Optional<Student> findFirstStudent() {
		return StudentDatabase.getAllStudents().stream()
				.filter(student -> student.getGpa() >= 3.9).findFirst();
	}

	public static void main(String[] args) {

		if (findAnyStudent().isPresent())
			System.out.println(
					"found the first student : " + findAnyStudent().get());
		else
			System.out.println("no students found");
		
		if (findFirstStudent().isPresent())
			System.out.println(
					"found the first student : " + findFirstStudent().get());
		else
			System.out.println("no students found");
	}

}
