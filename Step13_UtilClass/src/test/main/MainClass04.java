package test.main;

import java.util.ArrayList;
import java.util.List;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		//Car type 을 저장할 수 있는 ArrayList 객체를 생성해서
		ArrayList<Car> arr = new ArrayList<Car>();
		
		//참조값을 List 인터페이스 type 지역변수 cars에 담아보세요.
		List<Car> cars = arr;
		
		//Car 객체(3개)를 생성해서 List 객체에 저장해보세요
		for(int i = 0; i < 3; i++) {
			cars.add(new Car("자동차" + (i+1) ) );
		}
		//3. 반복문 for문을 이용해서 List 객체에 저장된 모든 Car객체의 drive() 메소드를 순서대로 호출하세요
		for(Car car : cars) {
			car.drive();
		}
		System.out.println();
		for(int i = 0; i < cars.size(); i++) {
			Car tmp = cars.get(i);
			tmp.drive();
		}
		
	}
}
