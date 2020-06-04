package test.main;

import test.mypac.SmartPhone;

public class MainClass04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//지역변수는 선언만 할 경우 변수도 안 만들어진다.
		SmartPhone p1;		
		
		//SmartPhone Type 의 지역변수 p2를 만들고 비워둔 상태(참조값이 담기지 않은)
		SmartPhone p2 = null;	
		
		//SmartPhone Type 의 지역변수 p3를 만들고 참조값을 넣어둔 상태
		SmartPhone p3 = new SmartPhone();
		
		//p1은 아직 만들어지지 않았기 때문에 문법이 성립하지 않는다.
		//p1.call();
		
		//p2는 비어있는(null이 들어있는)상태이기 때문에 실행되지 않는다.
		//(NullPointerException) 해결방법 참조 값이 왜 없는지를 찾아내야한다.
		//p2.call();	
		
	}

}
