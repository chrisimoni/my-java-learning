package com.imonichris.myjavalearning.streams;

import java.util.List;
import java.util.stream.Collectors;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamsMapExample {

	public static List<String> nameList() {
		return StudentDatabase.getAllStudents().stream().map(Student::getName).collect(Collectors.toList());
	}

	public static void main(String[] args) {
		System.out.println(nameList());
	}

}
