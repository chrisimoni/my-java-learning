package com.imonichris.myjavalearning.functional;

import java.util.List;
import java.util.function.BiPredicate;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class BiPredicateExample {

	public static void main(String[] args) {
		// Takes two inputs and return true of false
		BiPredicate<Integer, Double> biPredicate = (gradeLevel, gpa) -> gradeLevel >= 3 && gpa >= 3.9;
		List<Student> students = StudentDatabase.getAllStudents();
		
		students.forEach(student -> {
			if(biPredicate.test(student.getGradeLevel(), student.getGpa())) {
				System.out.println(student.getName() + " : " + student.getActivities());
			}
			
		});
	}

}
