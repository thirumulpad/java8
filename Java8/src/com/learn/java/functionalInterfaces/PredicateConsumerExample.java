package com.learn.java.functionalInterfaces;

import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class PredicateConsumerExample {

	Predicate<Student> p1 = (stu) -> stu.getGpa() >= 2;
	Predicate<Student> p2 = (stu) -> stu.getGradeLevel() >= 2;

	BiConsumer<String, List<String>> biConsumer = (name, activities) -> System.out.println(name + " : " + activities);

	Consumer<Student> studentConsumer = (stu) -> {
		if (p1.and(p2).test(stu)) {
			biConsumer.accept(stu.getName(), stu.getActivities());
		}
	};

	public void printNamesAndActivities(List<Student> students) {
		students.forEach(studentConsumer);
	}

	public static void main(String[] args) {
		List<Student> studentList = StudentDatabase.getAllStudents();
		new PredicateConsumerExample().printNamesAndActivities(studentList);
	}

}
