package com.learn.java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class BifunctionExample {
	static Predicate<Student> p1 = (student) -> student.getGradeLevel() >= 9;
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bifunction = (studentList, predicate) -> {
		Map<String, Double> nameGradeMap = new HashMap();
		studentList.forEach((student) -> {
			nameGradeMap.put(student.getName(), student.getGpa());
		});
		return nameGradeMap;
	};

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(bifunction.apply(StudentDatabase.getAllStudents(), p1));
	}

}
