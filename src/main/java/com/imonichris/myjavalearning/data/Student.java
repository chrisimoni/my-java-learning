package com.imonichris.myjavalearning.data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	private List<String> activities;
	private int noteBooks;
	
	public void printListOfActivities() {
		System.out.println(activities);
	}
}
