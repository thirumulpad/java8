package com.learn.java.stream;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamExample {
	static Supplier<List<Student>> studentList = () -> {
		return StudentDatabase.getAllStudents();
	};

	static Predicate<Student> p1 = (student) -> (student.getGpa() >= 3.9);
	static Predicate<Student> p2 = (student) -> (student.getGradeLevel() >= 3);

	public static void main(String[] args) {
		// student names and their activities in a map
		Map<String, List<String>> nameActivitiesMap = studentList.get().stream().filter(p1).filter(p2)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));

		System.out.println(nameActivitiesMap);

	}

}
