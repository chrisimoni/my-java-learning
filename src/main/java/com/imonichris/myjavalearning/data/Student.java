package com.imonichris.myjavalearning.data;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Student {
	private String name;
	private int gradeLevel;
	private double gpa;
	private String gender;
	private final List<String> activities;
	
	public void printListOfActivities() {
		System.out.println(activities);
	}
}
