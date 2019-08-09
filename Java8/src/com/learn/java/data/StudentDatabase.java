package com.learn.java.data;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;

public class StudentDatabase {

	public static Supplier<Student> studentSupplier = () -> {
		Student student = new Student("Adam", 2, 3.6, "male",
				Arrays.asList("volleyball", "basketball"), 9);
		Bike bike = new Bike();
		bike.setModel("Honda");
		bike.setName("Hunk");
		student.setBike(Optional.ofNullable(bike));
		return student;
	};

	public static List<Student> getAllStudents() {

		Student student1 = new Student("Adam", 2, 3.6, "male",
				Arrays.asList("volleyball", "basketball"), 9);
		Student student2 = new Student("Jenny", 2, 3.8, "female",
				Arrays.asList("kabadi", "basketball"), 10);

		Student student3 = new Student("Emily", 3, 4.0, "female",
				Arrays.asList("carrom", "basketball"), 15);
		Student student4 = new Student("Dave", 3, 3.9, "male",
				Arrays.asList("volleyball", "tennis"), 14);

		Student student5 = new Student("Sophia", 4, 3.5, "female",
				Arrays.asList("cricket", "tennis"), 8);
		Student student6 = new Student("James", 4, 3.9, "male",
				Arrays.asList("volleyball", "badminton"), 18);

		List<Student> students = Arrays.asList(student1, student2, student3,
				student4, student5, student6);
		return students;
	}
}
