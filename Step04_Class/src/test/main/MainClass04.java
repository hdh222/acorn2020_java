package test.main;

import test.mypac.Member;

public class MainClass04 {
<<<<<<< HEAD
	public static void main(String[] args) {
		/*
		 *  1, 김구라, 노량진 
		 *  
		 *  이라는 int, String, String type 의 값을 
		 *  
		 *  객체의 필드에 저장하는 프로그래밍을 해 보세요. 
		 *  
		 *  단 객체를 생성할 클래스의 이름은  Member 로 작성하세요.
		 */
		Member mem1=new Member();
		mem1.num=1;
		mem1.name="김구라";
		mem1.addr="노량진";
		
		// 2, 해골, 행신동 도 새로운 Member 객체를  생성해서 담아 보세요.
		Member mem2=new Member();
		mem2.num=2;
		mem2.name="해골";
		mem2.addr="행신동";
		
		//Member 객체의 메소드 호출하기
		mem1.showInfo();
		mem2.showInfo();
	}
}


















=======

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 김구라, 노량진
		 * 이라는 int, String, String type의 값을 객체의 필드에 저장하는 
		 * 프로그래밍을 해보세요
		 * 
		 * 단 객체를 생성할 클래스의 이름은 Member 로 작성하세요
		 */

		Member mem1 = new Member();

		mem1.number = 1;
		mem1.name = "김구라";
		mem1.addr = "노량진";

		//2, 해골, 행신동도 새로운 Member 객체를 생성해서 담아보세요
		Member mem2 = new Member();

		mem2.number = 2;
		mem2.name = "해골";
		mem2.addr = "행신동";

		System.out.println("번호 : "+ mem1.number + "\n" 
				+ "이름 : " + mem1.name + "\n" 
				+ "주소 : "+ mem1.addr );
		
		mem1.showInfo();
		mem2.showInfo();
	}

}
>>>>>>> refs/heads/study
