package service;

import pojo.Student;
import io.reactivex.Observable;

import java.util.List;

public class ReactiveService {
	public Observable<Student> getStudentsAboveAverage(final List<Student> studentList) {
		final Observable<Student> studentObservable = Observable.fromIterable(studentList);
		System.out.println("Initial students average mark");
		studentObservable.forEach(s -> System.out.println(s.getAverageGrade()));
		Observable<Student> studentsAboveAverage = studentObservable.filter(s -> s.getAverageGrade() > 5);
		System.out.println("Students average mark");
		studentsAboveAverage.subscribe(s -> System.out.println(s.getAverageGrade()));

		return studentsAboveAverage;
	}

	public Observable<Student> makeAllPass(final List<Student> studentList) {
		Observable<Student> studentObservable = Observable.fromIterable(studentList);
		System.out.println("Initial students average mark");
		studentObservable.forEach(s -> System.out.println(s.getAverageGrade()));
		System.out.println("After passing exam");
		return studentObservable.map(s -> {
			if (s.getAverageGrade() < 5) {
				s.setAverageGrade(5.0);
				s.setFirstGrade(5.0);
				s.setSecondGrade(5.0);
				s.setThirdGrade(5.0);
			}
			return s;
		});
	}

	public void makeAllPassAndPrint(final List<Student> studentList) {
		makeAllPass(studentList).subscribe(s -> System.out.println(s.getAverageGrade()));
	}
}
