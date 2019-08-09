package com.learn.java.streams.terminal;

import java.util.Comparator;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsGroupingMaxbyMinByExample {

	public static Map<Integer, Optional<Student>> groupingMaxByOptional() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors
						.maxBy(Comparator.comparing(Student::getGpa))));
	}

	public static Map<Integer, Optional<Student>> groupingMinByOptional() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.groupingBy(Student::getGradeLevel, Collectors
						.minBy(Comparator.comparing(Student::getGpa))));
	}

	public static Map<Integer, Object> groupingMaxBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(
								Collectors.maxBy(
										Comparator.comparing(Student::getGpa)),
								Optional::get)));
	}

	public static Map<Integer, Object> groupingMinBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.collectingAndThen(
								Collectors.minBy(
										Comparator.comparing(Student::getGpa)),
								Optional::get)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(groupingMaxBy());
		System.out.println(groupingMinBy());
	}

}
