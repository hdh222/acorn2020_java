package test.main;

import test.mypac.Car;
import test.mypac.MyObj;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * test.mypac 패키지에 다양한 모양의 메소드를 가지는 클래스를 정의하고
		 * 그 클래스를 이용해서 객체도 생성하고 메소드도 호출해보세요
		 */
		
		MyObj obj = new MyObj();
		
		obj.car(new Car());
		obj.carBrand("KIA");
		obj.myAge(27);
		
		Car car1 = obj.makeCar();
		car1.drive();
		
		obj.info(55, car1);
		
		int sum = obj.sum(20, 30);
		System.out.println(sum);
		
		double avg = obj.avg(sum, 2);
		System.out.println(avg);
		
		String msg = obj.msg("메소드", "실습");
		System.out.println(msg);
		
	}
}
