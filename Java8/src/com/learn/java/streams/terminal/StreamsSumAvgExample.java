package com.learn.java.streams.terminal;

import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsSumAvgExample {

	public static int sum() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.summingInt(Student::getNotebooks));
	}

	public static double average() {
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.averagingDouble(Student::getNotebooks));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("sum : " + sum());
		System.out.println("average : " + average());
	}

}
