package com.imonichris.myjavalearning.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamsFlatMapExample {

	public static List<String> printListOfActivities() {
		return StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.sorted()
				.collect(Collectors.toList());
	}
	
	public static long getStudentActivitiesCount() {
		return StudentDatabase.getAllStudents().stream()
				.map(Student::getActivities)
				.flatMap(List::stream)
				.distinct()
				.count();
	}
	
	public static void main(String[] args) {
		System.out.println(printListOfActivities());
		System.out.println(getStudentActivitiesCount());

	}

}
