package com.learn.java.stream;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamMapReduceExample {

	public static int totalNumberOfNotebooks() {
		return StudentDatabase.getAllStudents().stream()
				.map(Student::getNotebooks).reduce(0, (a, b) -> a + b);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(totalNumberOfNotebooks());
	}

}
