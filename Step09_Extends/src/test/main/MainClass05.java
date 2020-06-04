package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass05 {

	public static void main(String[] args) {
		//SmartPhone 객체를 생성해서 Phone type 지역변수 p1이라는 지역변수에 담기
		Phone p1 = new SmartPhone();
		
		//p1에 들어있는 참조 값을 이용해서 전화를 걸고싶다.
		p1.call();
		
		//p1에 들어있는 참조 값을 이용해서 이동중에 전화를 걸고싶다.
		//p1에 들어있는 참조 값을 HandPhone type 지역변수에 casting 해서 담는다.
		HandPhone p2 = (HandPhone)p1;
		//이동중에 전화를 걸 수 있다.
		p2.mobileCall();
		
		
		//p1에 들어있는 참조 값을 이용해서 인터넷을 하고 싶다
		SmartPhone p3 = (SmartPhone)p1;
		p3.doInternet();
	}

}
