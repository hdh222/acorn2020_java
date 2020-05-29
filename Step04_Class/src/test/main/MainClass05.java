package test.main;

import test.mypac.Rect;

public class MainClass05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rect r1 = new Rect();				//Rect 객체 생성해서 참조값을 r1이라는 지역변수에 담는다
		r1.height = 20;						
		r1.width = 10;
		
		int a = r1.getArea();
		
		Rect r2 = new Rect();
		r2.height = 20;
		r2.width = 10;
		
		int b = r2.getArea();
	}

}
