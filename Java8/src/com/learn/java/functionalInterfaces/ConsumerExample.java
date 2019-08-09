package com.learn.java.functionalInterfaces;

import java.util.List;
import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class ConsumerExample {

	public static void printStudents() {
		Consumer<Student> st = (student) -> System.out.println(student.toString());
		List<Student> students = StudentDatabase.getAllStudents();
		students.forEach(st);
	}

	public static void main(String[] args) {
		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("vivek");
		printStudents();
	}

}
