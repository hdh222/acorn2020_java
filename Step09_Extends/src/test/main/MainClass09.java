package test.main;

import test.auto.Car;
import test.auto.Engine;
import test.auto.KiaCar;
import test.auto.SportsCar;
import test.auto.Truck;

public class MainClass09{
	public static void main(String[] args) {
		//Car클래스를 상속받아서 만든 클래스로 객체를 생성해서
		//아래의 useCar()메소드를 호출해보세요.
		
		KiaCar kia = new KiaCar(new Engine());
		MainClass09.useCar(kia);
		
		SportsCar sCar = new SportsCar(new Engine());
		useCar(sCar);
		
	}
	
	public static void useCar(Car car) {
		car.drive();
	}
}
