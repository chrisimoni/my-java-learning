package com.imonichris.myjavalearning.streams;

import java.util.Optional;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamsFindAnyFirstExample {
	
	public static Optional<Student> findAnyStudent() {
		return StudentDatabase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findAny();
	}
	
	public static Optional<Student> findFirstStudent() {
		return StudentDatabase.getAllStudents().stream().filter(student -> student.getGpa() >= 3.9).findFirst();
	}

	public static void main(String[] args) {
		Optional<Student> findAnyStudent = findAnyStudent();
		if(findAnyStudent.isPresent()) {
			System.out.println("Found the student: " + findAnyStudent.get());
		}else {
			System.out.println("Student not found");
		}
		
		Optional<Student> findFirstStudent = findAnyStudent();
		if(findFirstStudent.isPresent()) {
			System.out.println("Found the student: " + findFirstStudent.get());
		}else {
			System.out.println("Student not found");
		}

	}

}
