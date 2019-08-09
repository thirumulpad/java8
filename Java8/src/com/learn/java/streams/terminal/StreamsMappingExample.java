package com.learn.java.streams.terminal;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsMappingExample {

	public static List<String> mapping() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.mapping(Student::getName, Collectors.toList()));
	}

	public static Set<String> mappingToSet() {
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.mapping(Student::getName, Collectors.toSet()));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Mapping to List : " + mapping());
		System.out.println("Mapping to Set : " + mappingToSet());
	}

}
