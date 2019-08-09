package com.learn.java.parallelstream;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class ParallelStreamExample1 {

	public static List<String> printStudentActivitiesSequentially() {
		long starttime = System.currentTimeMillis();

		List<String> activities = StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream).distinct()
				.sorted().collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		long totaltime = endTime - starttime;
		System.out.println("sequential time taken : " + totaltime);
		return activities;
	}

	public static List<String> printStudentActivitiesParallelly() {
		long starttime = System.currentTimeMillis();

		List<String> activities = StudentDatabase.getAllStudents()
				.parallelStream().map(Student::getActivities)
				.flatMap(List::stream).distinct().sorted()
				.collect(Collectors.toList());
		long endTime = System.currentTimeMillis();
		long totaltime = endTime - starttime;
		System.out.println("parallel time taken : " + totaltime);
		return activities;
	}

	public static void main(String[] args) {
		printStudentActivitiesSequentially();
		printStudentActivitiesParallelly();
	}

}
