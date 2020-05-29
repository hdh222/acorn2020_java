package test.main;

import test.mypac.Box;
import test.mypac.Car;
import test.mypac.Member;
import test.mypac.Rect;

public class MainClass06 {
	public static void main(String[] args) {
		
		System.out.println("main 메소드가 시작되었습니다.");
		Member a = Box.mem;				//null
		Rect b = Box.rect;				//null
		Car c = Box.car;				//참조 값이 들어있다.
		
		c.drive();						//참조 값이 들어있어 메소드 호출이 가능하다.
		
		Box.car.drive(); 				//c.drive()와 같다.
		
		System.out.println();
		
//		a.showInfo();					a가 null 이므로 NullPointerException 발생
//		b.getArea();					b가 null 이므로 NullPointerException 발생
	}
}
