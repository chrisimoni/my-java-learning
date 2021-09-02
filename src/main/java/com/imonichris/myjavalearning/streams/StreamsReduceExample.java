package com.imonichris.myjavalearning.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamsReduceExample {

	public static int performReduceMultiplication(List<Integer> numberList) {
		return numberList.stream().reduce(1, (a, b) -> a * b);
	}
	
	public static Optional<Student> getHighestGPAStudent() {
		return StudentDatabase.getAllStudents().stream().reduce((s1,s2) -> (s1.getGpa() > s2.getGpa()) ? s1 : s2);
	}

	public static void main(String[] args) {
		List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println(performReduceMultiplication(integerList));
		
		Optional<Student> student = getHighestGPAStudent();
		if(student.isPresent()) {
			System.out.println(student.get());
		}

	}

}
