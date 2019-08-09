package com.learn.java.optional;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class OptionalOrElseExample {

	// orElse
	public static String optionalOrElse() {
		// Optional<Student> studentOptional = Optional
		// .ofNullable(StudentDatabase.studentSupplier.get());
		Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName).orElse("Default");
		return name;

	}

	// orElseGet
	public static String optionalOrElseGet() {
		Optional<Student> studentOptional = Optional
				.ofNullable(StudentDatabase.studentSupplier.get());
		// Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName)
				.orElseGet(() -> "Default");
		return name;

	}
	// OrElseThrow
	public static String optionalOrElseThrow() {
//		Optional<Student> studentOptional = Optional
//				.ofNullable(StudentDatabase.studentSupplier.get());
		 Optional<Student> studentOptional = Optional.ofNullable(null);
		String name = studentOptional.map(Student::getName)
				.orElseThrow(() -> new RuntimeException("No Data Avaialble."));
		return name;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(optionalOrElse());
		System.out.println(optionalOrElseGet());
		System.out.println(optionalOrElseThrow());
	}

}
