package com.imonichris.myjavalearning.streams;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamExample {

	public static void main(String[] args) {
		Predicate<Student> studentPredicate = student -> student.getGradeLevel() >= 3;
		Predicate<Student> studentGpaPredicate = student -> student.getGpa()>= 3.9;
		// Student name and there activities in a map
		Map<String, List<String>> studentMap = StudentDatabase.getAllStudents().stream()
				.filter(studentPredicate)
				.filter(studentGpaPredicate)
				.collect(Collectors.toMap(Student::getName, Student::getActivities));
				
		System.out.println(studentMap);

	}

}
