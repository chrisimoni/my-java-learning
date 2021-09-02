package com.imonichris.myjavalearning.functional;

import java.util.Arrays;
import java.util.function.Supplier;

import com.imonichris.myjavalearning.data.Student;

public class SupplierExample {
	public static void main(String[] args) {
		// Supplier doesnt take any input but returns an output
		Supplier<Student> student = () -> new Student("Adam", 2, 3.6, "male",
				Arrays.asList("swimming", "basketball", "volleyball"), 10);

		System.out.println(student.get());
	}
}
