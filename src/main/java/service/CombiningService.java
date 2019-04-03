package service;

import io.reactivex.Observable;
import pojo.Student;

import java.util.List;

public class CombiningService {

	private final FilterService filterService = new FilterService();

	public Observable<Student> combineAllStudentsThatPassAndNot(List<Student> studentList) {
		return filterService.makeAllPass(studentList)
				.mergeWith(this.filterService.selectDistinctAverageStudents(studentList));
	}

	public Observable<Student> zipAllStudents(List<Student> studentList) {
		return filterService.makeAllPass(studentList)
				.zipWith(filterService.selectDistinctAverageStudents(studentList),
						(final Student a, final Student b) -> new Student.builder().name(a.getName() + " - " + b.getName()).build());

	}
}
