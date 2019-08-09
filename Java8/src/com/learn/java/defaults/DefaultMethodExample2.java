package com.learn.java.defaults;

import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class DefaultMethodExample2 {

	private static Consumer<Student> studentConsumer = (student) -> System.out
			.println(student);
	private static Comparator<Student> nameComparator = Comparator
			.comparing(Student::getName);
	private static Comparator<Student> gpaComparator = Comparator
			.comparing(Student::getGpa);
	private static Comparator<Student> gradeComparator = Comparator
			.comparing(Student::getGradeLevel);

	public static void sortbyName(List<Student> students) {
		students.sort(nameComparator);
		students.forEach(studentConsumer);
	}
	public static void sortbyGPA(List<Student> students) {
		students.sort(gpaComparator);
		students.forEach(studentConsumer);
	}
	public static void sortbyGradeAndName(List<Student> students) {
		students.sort(gradeComparator.thenComparing(nameComparator));
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudents();
		// sortbyName(studentList);
//		sortbyGPA(studentList);
		sortbyGradeAndName(studentList);
	}

}
