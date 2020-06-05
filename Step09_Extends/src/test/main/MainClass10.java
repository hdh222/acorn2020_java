package test.main;

import test.human.Blood;

public class MainClass10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//자바는 필드를 private로 많이 가린다.
		//Blood 객체를 생성해서 참조값을 b1 이라는 지역변수에 담아보세요
		Blood b1 = new Blood("+","A"); 	
		Blood b2 = new Blood("+","O");
		
		String rh = b1.getRh();
		
		
		b1.setRh("-");
		String rh2 = b1.getRh();
		
		System.out.println(rh);
		System.out.println(rh2);
	}

}
