package service;

import io.reactivex.Observable;
import pojo.Employee;
import pojo.Student;

import java.util.List;

public class TransformService {

	public Observable<Employee> hireStudents(final List<Student> studentList) {
		return Observable.fromIterable(studentList).map(student -> new Employee.builder().name(student.getName()).build());
	}

	public Observable<Employee> hireStudentsWithAverageAboveFive(final List<Student> studentList) {
		return Observable.fromIterable(studentList).flatMap(student -> student.getAverageGrade() > 5 ? Observable.just(
				new Employee.builder().name(student.getName()).build()
		) : Observable.empty());
	}

}
