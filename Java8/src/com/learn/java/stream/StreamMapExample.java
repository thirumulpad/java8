package com.learn.java.stream;

import java.util.List;
import java.util.Set;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

// map is used to convert a type to another type.
public class StreamMapExample {

	static Supplier<List<Student>> studentList = () -> StudentDatabase
			.getAllStudents();

	public static void main(String[] args) {

		System.out.println(nameList());
		System.out.println(nameSet());
	}

	public static List<String> nameList() {
		List<String> studentNameList = studentList.get().stream()
				.map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toList());
		return studentNameList;
	}

	public static Set<String> nameSet() {
		Set<String> studentNameSet = studentList.get().stream()
				.map(Student::getName).map(String::toUpperCase)
				.collect(Collectors.toSet());
		return studentNameSet;
	}
}
