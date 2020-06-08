package test.main;

import test.mypac.Zoo;
import test.mypac.Zoo.Monkey;
import test.mypac.Zoo.Tiger;

public class MainClass03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Zoo 클래스에 있는 getMonkey()메소드를 호출해서
		// 리턴되는 값을 m1 이라는 지역변수에 담아보세요
		Monkey m1 = new Zoo().getMonkey();				//inner class type Monkey
		m1.say();
		
		//Zoo 클래스에 있는 getTiger() 메소드를 호출해서
		//리턴되는 값을 t1 이라는 지역변수에 담아보세요.
		Tiger t1 = new Zoo().getTiger();
		t1.say();
	}

}
