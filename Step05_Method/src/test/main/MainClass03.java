package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject obj1 = new MyObject();
		
		int num = 0;
		String name = "홍길동";
//		Car car = new Car();	같은의미
		
		obj1.setNum(num);
		obj1.setName(name);
		obj1.useCar(new Car());
	}

}
