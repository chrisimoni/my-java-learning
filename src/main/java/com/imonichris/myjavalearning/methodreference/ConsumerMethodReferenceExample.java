package com.imonichris.myjavalearning.methodreference;

import java.util.function.Consumer;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class ConsumerMethodReferenceExample {

	//static Consumer<Student> c1 = p -> System.out.println(p);
	static Consumer<Student> c1 = System.out::println;
	static Consumer<Student> c2 = Student::printListOfActivities;
	
	public static void main(String[] args) {
		StudentDatabase.getAllStudents().forEach(c1);
		StudentDatabase.getAllStudents().forEach(c2);
	}

}
