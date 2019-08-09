package com.learn.java.stream;

import java.util.List;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamFlatMapExample {

	public static List<String> getStudentActivities() {
		List<String> activitiesList = StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream)
				.collect(Collectors.toList());

		return activitiesList;
	}
	public static List<String> getStudentActivitiesSorted() {
		List<String> activitiesList = StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream).distinct()
				.sorted().collect(Collectors.toList());

		return activitiesList;
	}
	public static Long getStudentActivitiesCount() {
		Long activitiesListCount = StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities).flatMap(List::stream).distinct()
				.count();

		return activitiesListCount;
	}
	public static void main(String[] args) {
		System.out
				.println("List of activities are : " + getStudentActivities());

		System.out.println(
				"List of activities are : " + getStudentActivitiesSorted());

		System.out.println(
				"List of activities are : " + getStudentActivitiesCount());
	}

}
