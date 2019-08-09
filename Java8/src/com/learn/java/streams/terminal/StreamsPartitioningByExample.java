package com.learn.java.streams.terminal;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.learn.java.data.Student;
import com.learn.java.data.StudentDatabase;

public class StreamsPartitioningByExample {

	public static Map<Boolean, List<Student>> partitioningBy_1() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
		return StudentDatabase.getAllStudents().stream()
				.collect(Collectors.partitioningBy(gpaPredicate));
	}

	public static Map<Boolean, Set<Student>> partitioningBy_2() {
		Predicate<Student> gpaPredicate = student -> student.getGpa() >= 3.8;
		return StudentDatabase.getAllStudents().stream().collect(
				Collectors.partitioningBy(gpaPredicate, Collectors.toSet()));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("partitioningBy_1 : " + partitioningBy_1());
		System.out.println("partitioningBy_2 : " + partitioningBy_2());
	}

}
