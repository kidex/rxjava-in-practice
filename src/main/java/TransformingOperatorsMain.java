import pojo.Student;
import service.TransformService;
import util.StudentGenerator;

import java.util.List;

public class TransformingOperatorsMain {
	public static void main(String[] args) {
		final TransformService transformService = new TransformService();
		final List<Student> studentList = StudentGenerator.generateListOfStudents();

		transformService.hireStudents(studentList).subscribe(employee -> System.out.println(employee.getName()));
	}
}
