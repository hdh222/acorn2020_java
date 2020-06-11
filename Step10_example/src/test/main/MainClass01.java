package test.main;

import test.mypac.AirConditioner;
import test.mypac.Samsung;

public class MainClass01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Samsung s1 = new Samsung();
		s1.off();
		s1.on();
		
		AirConditioner a = new AirConditioner() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println("냉방을 키다");
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println("냉방을 끄다");
			}
		};
		a.on();
		a.off();
		
		AirConditioner b = new Samsung();
	}

}
