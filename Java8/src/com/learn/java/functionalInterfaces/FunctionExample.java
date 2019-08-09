package com.learn.java.functionalInterfaces;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class FunctionExample {

	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> studentGradeMap = new HashMap<String, Double>();
		students.forEach((student) -> {
			studentGradeMap.put(student.getName(), student.getGpa());
		});
		return studentGradeMap;
	});

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));
	}

}
