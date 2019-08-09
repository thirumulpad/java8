package com.learn.java.streams.terminal;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamGroupingByExample {

	public static Map<String, List<Student>> groupByGender() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGender));

	}

	public static Map<String, List<Student>> customizedGroupByGpa() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.groupingBy(student -> student.getGpa() >= 3.8
						? "Outstanding"
						: "Average"));

	}

	public static Map<Integer, Map<String, List<Student>>> twoLevelGrouping_1() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getGradeLevel,
						Collectors.groupingBy(student -> student.getGpa() >= 3.8
								? "Outstanding"
								: "Average")));
	}

	public static Map<String, Integer> twoLevelGrouping_2() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,
						Collectors.summingInt(Student::getNotebooks)));
	}

	public static LinkedHashMap<String, Set<Student>> threeArgumentGroupBy() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.groupingBy(Student::getName,
						LinkedHashMap::new, Collectors.toSet()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// System.out.println(groupByGender());
		// System.out.println("group by gpa : " + customizedGroupByGpa());
		// System.out.println("two level grouping : " + twoLevelGrouping_1());
		System.out.println("two level grouping : " + twoLevelGrouping_2());
		System.out
				.println("three argument grouping : " + threeArgumentGroupBy());
	}

}
