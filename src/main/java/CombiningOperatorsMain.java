import pojo.Student;
import service.CombiningService;
import util.StudentGenerator;

import java.util.List;

public class CombiningOperatorsMain {

	private static final CombiningService combiningService = new CombiningService();

	public static void main(String[] args) {
		List<Student> studentList = StudentGenerator.generateListOfStudents();

		combiningService.combineAllStudentsThatPassAndNot(studentList).forEach(student -> System.out.println(student.getName()));
		combiningService.zipAllStudents(studentList).forEach(student -> System.out.println(student.getName()));
	}
}
