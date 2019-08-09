package com.learn.java.optional;

import java.util.Optional;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class OptionalMapFlatMapExample {

	// filter
	public static void optionalFilter() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDatabase.studentSupplier.get());
		studentOptional.filter(student -> student.getGpa() >= 3.9)
				.ifPresent(student -> System.out.println(student));
	}
	// map
	public static void optionalMap() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDatabase.studentSupplier.get());
		studentOptional.filter((student) -> student.getGpa() >= 3.5)
				.map(Student::getName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		optionalFilter();
	}

}
