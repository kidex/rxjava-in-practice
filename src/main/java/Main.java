import io.reactivex.Observable;

import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		Observable<String> observableWithJust = Observable.just("A");
		Observable<String> observableWithCreate = Observable.create((subscriber) -> subscriber.onNext("B"));
		Observable observableWithEmpty = Observable.empty();
		Observable<String> observableWithIterable = Observable.fromIterable(Arrays.asList("A", "B", "C", "D"));
		Observable<Integer> observableWithRange = Observable.range(1,10);

		observableWithJust.subscribe(stringHere -> System.out.println("New observable" + stringHere));
		observableWithCreate.subscribe(stringHere -> System.out.println("New observable" + stringHere));
		observableWithEmpty.subscribe(stringHere -> System.out.println("New observable" + stringHere));
		observableWithIterable.subscribe(stringHere -> System.out.println("New observable" + stringHere));
		observableWithRange.subscribe(integerHere -> System.out.println("New observable" + integerHere));

	}
}
