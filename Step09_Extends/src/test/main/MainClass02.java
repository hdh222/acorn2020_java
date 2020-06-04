package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//SmartPhone 객체를 생성해서 SmartPhone Type의 지역변수 p1에 담기
		SmartPhone p1 = new SmartPhone();
		
		//p1에 담긴 참조 값을 HandPhone Type 지역변수 p2에 담기
		HandPhone p2 = p1;
		
		//p1에 담긴 참조 값을 Phone Type 지역변수 p3에 담기
		Phone p3 = p1;
		
		//p1에 담긴 참조 값을 Object Type 지역변수 p4에 담기
		Object p4 = p1;
		
		
	}

}
