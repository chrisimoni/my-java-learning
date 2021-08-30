package com.imonichris.myjavalearning.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class StudentDatabase {
	public static Supplier<Student> studentSupplier = () -> {
		return new Student("Adam", 2, 3.6, "male",
                Arrays.asList("swimming", "basketball", "volleyball"));
	};
	
	public static List<Student> getAllStudents() {
        Student student1 = new Student("Adam", 2, 3.6, "male",
                Arrays.asList("swimming", "basketball", "volleyball"));
        Student student2 = new Student("Jenny", 2, 3.8, "female",
                Arrays.asList("hiking", "basketball", "runnung"));
        Student student3 = new Student("Emily", 3, 4.0, "female",
                Arrays.asList("aerobics", "gymnastics", "baseball"));
        Student student4 = new Student("Ken", 3, 3.7, "male",
                Arrays.asList("soccer", "football", "tennis"));
        Student student5 = new Student("Roy", 4, 3.1, "male",
                Arrays.asList("rocket", "jumping", "diving"));
        Student student6 = new Student("Tom", 4, 3.9, "male",
                Arrays.asList("sleeping", "singing", "reading"));

        return Arrays.asList(student1,student2,student3,student4,student5,student6);
    }
}
