package util;

import pojo.Student;

import java.util.ArrayList;
import java.util.List;

public class StudentGenerator {
	public static Student generateStudent(final int counter) {
		return new Student.builder()
				.name("John" + counter)
				.firstGrade(generateDouble())
				.secondGrade(generateDouble())
				.thirdGrade(generateDouble()).build().computeAndSetAverageGrade();
	}

	public static List<Student> generateListOfStudents() {
		final List<Student> studentList = new ArrayList<Student>();
		for(int i = 0; i < 10; i++) {
			studentList.add(generateStudent(i));
		}
		return studentList;
	}

	public static Double generateDouble() {
		return Double.parseDouble(String.format("%.2f",Math.random() * 10 + 1));
	}
}
