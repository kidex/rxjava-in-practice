import pojo.Student;
import service.FilterService;
import util.StudentGenerator;

import java.util.List;

public class FilteringOperatorsMain {

	public static void main(String[] args) {
		final FilterService filterService = new FilterService();
		final List<Student> studentList = StudentGenerator.generateListOfStudents();
		filterService.getStudentsAboveAverage(studentList);
		filterService.makeAllPassAndPrint(studentList);
		filterService.printStudents(filterService.selectDistinctAverageStudents(filterService.makeAllPass(studentList).toList().blockingGet()));
	}

}
