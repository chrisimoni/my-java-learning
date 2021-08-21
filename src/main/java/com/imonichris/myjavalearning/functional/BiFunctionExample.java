package com.imonichris.myjavalearning.functional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Predicate;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class BiFunctionExample {
	// Takes two input and return an output
	static BiFunction<List<Student>, Predicate<Student>, Map<String, Double>> bf = ((students, studentPredicate) -> {
		Map<String, Double> studentGradeMap = new HashMap<>();
		students.forEach(student -> {
			if (studentPredicate.test(student)) {
				studentGradeMap.put(student.getName(), student.getGpa());
			}
		});

		return studentGradeMap;
	});

	public static void main(String[] args) {
		Predicate<Student> predicate = s -> s.getGradeLevel() >= 3;
		System.out.println(bf.apply(StudentDatabase.getAllStudents(), predicate));
	}

}
