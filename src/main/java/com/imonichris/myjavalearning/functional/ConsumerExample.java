package com.imonichris.myjavalearning.functional;

import java.util.List;
import java.util.function.Consumer;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class ConsumerExample {

	public static void main(String[] args) {
		// It represents a function which takes in one argument and produces a result.
		// However these kind of functions don't return any value.

		Consumer<String> c1 = (s) -> System.out.println(s.toUpperCase());
		c1.accept("Java 8");

		printName();

	}

	public static void printName() {
		List<Student> studentList = StudentDatabase.getAllStudents();
		Consumer<Student> c2 = (student) -> System.out.println(student);

		studentList.forEach(c2);
	}

}
