package test.main;

import java.util.HashSet;
import java.util.Set;

import test.mypac.Car;
/*
 * HashSet은 Set 인터페이스를 구현한 클래스이다.
 * - 순서가 없다.
 * - key갑도 없다
 * - 중복을 허용하지 않는다.
 * - 어떤 data를 묶음으로 관리하고자 할 때 사용한다.
 */
public class MainClass12 {
	public static void main(String[] args) {
		
		//정수 값을 저장할 수 있는 hashSet객체
		Set<Integer> set1 = new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		set1.add(50);
		set1.add(50);

		//문자열을 저장할 수 있는 HashSet 객체 생성
		Set<String> set2 = new HashSet<>();
		set2.add("kim");
		set2.add("lee");
		set2.add("park");
		set2.add("lee");
		set2.add("park");
		
		
		//Car 객체를 저장할 수 있는 HashSet객체
		Set<Car> set3 = new HashSet<>();
		set3.add(new Car("프라이드"));
		set3.add(new Car("프라이드"));
		set3.add(new Car("소나타"));
		set3.add(new Car("그랜저"));
	}
}
/*
 * HashSet에는 중복된 값이 들어가지 않는다.
 */
 