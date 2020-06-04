package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass03 {

	public static void main(String[] args) {
		
		//HandPhone 객체를 생성해서 HandPhone type 지역변수 p1에 담기
		HandPhone p1 = new HandPhone();
		
		//인터넷을 해야한다 . 즉 SmartPhone Type 객체가 필요하다
		//p1안에 있는 값을 이용해서 인터넷을 할 수 있을까?
		
		//실행시에 ClassCastException  발생 (객체가 HandPhone으로 생성되었기 때문에 SmartPhone객체와 관련이 없다.)
//		SmartPhone p2 = (SmartPhone)p1;		
//		
//		
//		p2.doInternet();
	}

}
