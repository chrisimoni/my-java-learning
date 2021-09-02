package com.imonichris.myjavalearning.streams;

import com.imonichris.myjavalearning.data.Student;
import com.imonichris.myjavalearning.data.StudentDatabase;

public class StreamsMapReduceExample {

	private static int noOfNoteBooks() {
		return StudentDatabase.getAllStudents().stream().map(Student::getNoteBooks).reduce(0, Integer::sum);
	}

	public static void main(String[] args) {
		System.out.println("Number of notebooks: "+ noOfNoteBooks());
	}

}
