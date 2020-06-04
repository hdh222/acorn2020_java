package test.main;

import test.auto.BmwCar;
import test.auto.Engine;
import test.auto.KiaCar;
import test.auto.SportsCar;
import test.auto.Truck;

public class MainClass08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Truck 객체를 생성해서, .drive() .dump() 메소드를 호출해보세요

		Truck t1 = new Truck(new Engine());

		t1.drive();
		t1.dump();
		
		//SportsCar 객체를 생성해서, .drive()메소드를 호출해보세요
		SportsCar scar = new SportsCar(new Engine());
		scar.drive();
		
		KiaCar kCar = new KiaCar(new Engine());
		kCar.drive();
		
		BmwCar bmwCar = new BmwCar(new Engine());
		bmwCar.drive();
	}
}
/*
 * 필드에는 메소드에서 참조하는 값들이 많이 들어간다.
 * 
 * 
 * 접근지정자
 * 1. public		- 어디에서나 자유롭게 접근 가능 
 * 2. protected		- 패키지가 달라도 상속관계이면 접근 가능
 * 3. default		- 같은 패키지에서만 접근 가능
 * 4. private		- 같은 클래스안에서만 접근 가능
 * */
