package com.imonichris.myjavalearning.streams;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamsComparatorExample {

	public static List<Student> sortStudentsByName() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getName))
				.collect(Collectors.toList());

	}
	
	public static List<Student> sortStudentsByGpa() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa))
				.collect(Collectors.toList());

	}
	
	public static List<Student> sortStudentsByGpaDesc() {
		return StudentDatabase.getAllStudents().stream().sorted(Comparator.comparing(Student::getGpa).reversed())
				.collect(Collectors.toList());

	}

	public static void main(String[] args) {
		System.out.println("Sort students by name");
		sortStudentsByName().forEach(System.out::println);
		System.out.println("Sort students by gpa");
		sortStudentsByGpa().forEach(System.out::println);
		System.out.println("Sort students by gpa Desc");
		sortStudentsByGpaDesc().forEach(System.out::println);
	}

}
