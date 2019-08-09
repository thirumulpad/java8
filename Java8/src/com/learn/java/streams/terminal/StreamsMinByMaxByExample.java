package com.learn.java.streams.terminal;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsMinByMaxByExample {

	public static Optional minByExample() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.minBy(Comparator.comparing(Student::getGpa)));
	}

	public static Optional maxByExample() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.maxBy(Comparator.comparing(Student::getGpa)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(minByExample());
		System.out.println(maxByExample());
	}

}
