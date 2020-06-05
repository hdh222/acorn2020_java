package test.main;

import test.human.Blood;
import test.human.Man;
import test.human.Person;

public class MainClass11 {
	public static void main(String[] args) {
		/*
		 * 프로그래밍의 목적 : 영화를 보고 싶다.
		 * 영화를 보는 프로그래밍의 목적을 달성해보세요
		 * 
		 */
	
		Man man1 = new Man(new Blood("+","A"));
		man1.seeMovie();
		/*
		 * Blood b1 = new Blood("+","A"):
		 * Man man = new Man(b1)
		 * man.seeMovie();
		 */
		/*
		 * 일회용
		 * new Man(new Blood("+","A")).seeMovie();
		 */
		
		Person man2 = new Man(new Blood("+","A"));
		man2.study();
		man2.walk();
	
		/*
		 * Men객체를 생성
		 * 객체생성은 new 예약어와 함께 킄래스명 ()
		 * class명()는 생성자 호출
		 * Man클래스의 생성자를 보니 public Man(Blood blood){ } 
		 * 생성자의 인자로 Blood type의 참조 값을 전달
		 */
	}
}
