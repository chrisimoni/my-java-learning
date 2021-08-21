package com.imonichris.myjavalearning.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class FunctionExample {

	// Example 1: Takes an input and return an output (converts string to uppercase)
	static Function<String, String> func = name -> name.toUpperCase();

	// Example 2: Takes a list of students and returns a map of student GPA
	static Function<List<Student>, Map<String, Double>> studentFunction = (students -> {
		Map<String, Double> studentGradeMap = new HashMap<String, Double>();
		students.forEach(student -> {
			studentGradeMap.put(student.getName(), student.getGpa());
		});

		return studentGradeMap;
	});

	public static void main(String[] args) {

		System.out.println(func.apply("Chris Imoni"));
		System.out.println(studentFunction.apply(StudentDatabase.getAllStudents()));

	}

}
