package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;

public class MainClass07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//기본 생성자를 호출해서 객체 생성하고 참조값을 지역변수에 담기
		Computer com = new Computer();
		//cpu Type 을 전달받은 생성자를 호출해서 객체생성하고 참조값을 지역변수에 담기
		Computer com2 = new Computer(new Cpu());
		
		com.doGame();
		com2.doGame();
	}

}
