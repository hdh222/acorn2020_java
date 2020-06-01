package test.main;

import test.mypac.Car;
import test.mypac.MyObject;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyObject obj1 = new MyObject();
		
		//a,b,c의 참조값은 getCar메소드에서 new 예약어를 사용하여 만든 객체를 리턴해주기 때문에 참조 값이 전부 다르다.
		Car a = obj1.getCar();
		Car b = obj1.getCar();
		Car c = obj1.getCar();
		
		//지역변수에 담긴 객체 사용
		a.drive();
		b.drive();
		c.drive();
	}

}
