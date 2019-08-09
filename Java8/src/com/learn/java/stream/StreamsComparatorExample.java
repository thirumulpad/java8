package com.learn.java.stream;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName() {

		return StudentDatabase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());
	}
	public static List<Student> sortStudentsByGpa() {

		return StudentDatabase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());
	}
	public static List<Student> sortStudentsByGpaDesc() {

		return StudentDatabase.getAllStudents().stream()
				.sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println("Students sorted by Name : ");
		sortStudentsByName().forEach(System.out::println);

		System.out.println("Students sorted by GPA : ");
		sortStudentsByGpa().forEach(System.out::println);

		System.out.println("Students sorted by GPA Desc: ");
		sortStudentsByGpaDesc().forEach(System.out::println);
	}

}
